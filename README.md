[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/bwKubpYc)
## Homework 1

The deadline for Homework 1 is Thursday, February 5th, 2pm. 

Refer to the homework handout [`hw01.pdf`](hw01.pdf) for details about the assignment. This file provides some information to help you get started with setting up your development environment for the homework assignments.

### Getting the code template

Before you perform the next steps, you first need to create your own
private copy of this git repository. To do so, click on the link
provided in the announcement of this homework assignment on
Brightspace. After clicking on the link, you will receive an email from
GitHub, when your copy of the repository is ready. It will be
available at
`https://github.com/nyu-popl-sp26/hw01-<YOUR-GITHUB-USERNAME>`.
Note that this may take a few minutes.

* Open a browser at `https://github.com/nyu-popl-sp26/hw01-<YOUR-GITHUB-USERNAME>` with your GitHub username inserted at the appropriate place in the URL.
* Choose a place on your computer for your homework assignments to reside and open a terminal to that location.
* Execute the following git command: <br/>
  ```bash
  git clone https://github.com/nyu-popl-sp26/hw01-<YOUR-GITHUB-USERNAME>.git hw01
  cd hw01
  ```

Please make sure that you clone the copy of your own version of this repository that is identified by your GitHub username, rather than the template repository.

The problems that you should solve for this assignment are described in the file `hw01.pdf`.
The assignment consists of two parts:

1. The solutions to problems 1 and 2 are to be put into the file `solution.md`.

2. The code template for solving Problem 3 is provided in the file 
   ```
   src/main/scala/popl/hw01.scala 
   ``` 
   relative to the root directory of the repository. Follow the instructions in the
   [in-class-code](https://github.com/nyu-popl-sp26/in-class-code)
   repository to import the project into IntelliJ (or use your other
   favorite IDE or editor to work on the assignment).

   You can implement the solutions by replacing the `???`
   expressions in `hw01.scala` with your code for the corresponding
   part. Please do not modify the signatures of the given function
   definitions (i.e. do not change the names of these functions, their
   arguments, or their return types).


### Submitting your solution

Once you have completed the assignment, you can submit your solution
by pushing the modified code template to GitHub. This can be done by
opening a terminal in the project's root directory and executing the
following commands in the terminal:

```bash
git add .
git commit -m "solution"
git push
```

You can replace "solution" by a more meaningful commit message.

Refresh your browser window pointing at
```
https://github.com/nyu-popl-sp26/hw01-<YOUR-GITHUB-USERNAME>/
```
and double-check that your solution has been uploaded correctly.

You can resubmit an updated solution anytime by re-executing the above
git commands. The late policy regarding assignments can be found under Syllabus on Brightspace. 


### ScalaTest

We will be using the [ScalaTest](http://www.scalatest.org/) framework for unit testing.  
Using this framework, we practice test-driven development (TDD), a standard practice in industry.

You do not need to explicitly download ScalaTest. It will be automatically downloaded when you import the project into the IDE, respectively, when you run `sbt` from inside the project directory. 

We provide some unit tests to drive your implementation. These are given in the file

```
src/test/scala/popl/hw01Spec.scala
```

To run tests within the IDE, right-click on the file and select
`Run 'hw01Spec'`. Alternatively, open the file and press `Cmd+Shift+F10` [OSX] or `Ctrl+Shift+F10` [Ubuntu].

This will compile your solution, run the tests, and create a new view tab called that shows which of the tests succeeded or failed. If a test failed, you can click on it to see a more detailed error output.

### Command-Line Tools

While not strictly required if you have installed IntelliJ Idea, you may also want to install command-line tools. In particular, if you would like to build the project on the command line, you should install [sbt](http://www.scala-sbt.org/).
sbt will become particularly useful in later homework assignments to test your interpreter implementation. Follow the instructions given in the [in-class-code](https://github.com/nyu-popl-sp26/in-class-code) repository for installing sbt.


For your convenience, an sbt build script `build.sbt` is included in the code package.  Open a terminal window and change into the directory that contains the project repository for the assignment. You can then issue the following commands to compile, test and run your code:

```bash
$ sbt test
```

This command executes all unit tests found in the project (after compiling). For this homework assignment, these are the tests defined in `src/test/scala/hw01Spec.scala`

```bash
$ sbt run
```

This command runs your project's main application (after compiling). For this homework assignment, this is the application defined by the object `hw01` in the file `src/main/scala/popl/hw01.scala`.

```bash
$ sbt clean
```

This commands deletes the intermediate files generated from the previous compilation.

It is often convenient to run sbt interactively. To start the interactive shell of sbt, simply execute the following command in a terminal inside the root directory of the project:

```bash
$ sbt
```

Alternatively, you can also start the sbt shell from inside IntelliJ Idea. Simply press `Cmd+Shift+S` [OSX] or `Ctrl+Shift+S` [Ubuntu], or click on 'sbt shell' in the pane at the bottom of the window.

Once the interactive shell has been initialized, you will see a command prompt, indicated by the symbol `>`. You can then execute any sbt command at the prompt. E.g. the sbt command

```
> test
```

will compile your solution and run all unit tests.

### Scala Interpreter

From the sbt prompt, you can also start the Scala interpreter (the REPL) using the command


```
> console
```

Once the Scala interpreter has started, you can import the functions in your homework in the following way

```
> import popl.hw01._
```

Then you can execute any of the functions defined in the object `hw01`. E.g.

```
> plus(2, 3)
val res0: Int = 5
```

Please note that if you make changes to the source code in
`hw01.scala` after you have started a Scala REPL session, these
changes will not be automatically recognized by the interpreter.  To
reload any changed files, you can execute the command `:reset` in the
Scala REPL.  This will reset the REPL to its initial state. Then you
can reload the changed file by executing `import popl.hw01._`.

You can close an active REPL session by executing the command `:quit`
or by pressing `Cmd+d` respectively `Ctrl+d`. You will then return to
the sbt prompt. Use the `:help` command to get information about all
commands that are available in the REPL.
