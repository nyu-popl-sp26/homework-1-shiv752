package popl

object hw01 extends App:
  /*
   * CSCI-UA.0480-055: Homework 1
   */

  /*
   * Replace the '???' expressions with your code in each function.
   *
   * Do not make other modifications to this template, such as
   * leaving any failing asserts.
   *
   * Your solution will _not_ be graded if it does not compile!!
   *
   * This template compiles without error. Before you submit comment out any
   * code that does not compile or causes a failing assert.  Simply put in a
   * '???' as needed to get something that compiles without error.
   */

  /*
   * Example with a Unit Test
   *
   * A convenient, quick-and-dirty way to experiment, especially with small code
   * fragments, is to use the interactive Scala interpreter.
   *
   * To run a function defined in this file in the interpreter, first either:
   * 1. From within IntelliJ Idea, select "Tools" from the top menu, and select "Scala REPL"
   * 2. execute `sbt console` on the command line within the hw01 root directory.
   * Then execute: import popl.hw01._
   * You can now execute functions defined in the hw01 object.
   * For example, execute: testPlus1()
   * The assertion in testPlus1() passes, so it appears as if nothing happens.
   * You can uncomment the "bad test specification" and see that a failed assert throws an exception.
   *
   * Please note that if you make changes to the source code in hw01.scala after you have started a
   * Scala REPL session, these changes will not be automatically recognized by the interpreter.
   * To reload any changed files, you can execute the command ":reset" in the Scala REPL.
   * This will reset the REPL to its initial state. Then you can reload the changed file by
   * executing import popl.hw01._.
   *
   * To experiment with the code, you can try calling 'plus' with some arguments, e.g., plus(1,2).
   * You should get a result something like 'res0: Int = 3'.
   *
   * As an alternative, the testPlus2 function takes an argument that has the form
   * of a plus function, so we can try it with different implementations.  For example,
   * uncomment the "testPlus2(badplus)" line, and you will see an assertion failure.
   *
   * Our convention is that these "test" functions are testing code that are not part
   * of the "production" code.
   *
   * While writing such testing snippets is convenient, it is not ideal.  For example,
   * the 'testPlus1()' call is run whenever this object is loaded, so in practice,
   * it should probably be deleted for "release".  A more robust way to maintain
   * unit tests is in a separate file.  For us, we use the convention of writing
   * tests in a file called hwXXSpec.scala (i.e., hw01Spec.scala for Homework 1).
   *
   * To run the unit tests for Homework 1, right-click on the file
   * src/test/scala/popl/hw01Spec.scala
   * and select "Run 'hw01Spec'".
   *
   * Alternatively, you can run the unit tests by starting the sbt console from the
   * command line inside the project root directory and executing the command "test".
   */

  def plus(x: Int, y: Int): Int = x + y

  def testPlus1(): Unit =
    assert(plus(1, 1) == 2)
    //assert(plus(1,1) == 3) // bad test specification

  testPlus1()

  def badplus(x: Int, y: Int): Int = x - y

  def testPlus2(plus: (Int, Int) => Int): Unit =
    assert(plus(1, 1) == 2)

  //testPlus2(badplus)

  /* Exercises */

  def abs(n: Double): Double =
    ???

  def ar(p: Int): Int =
    ???

  def rep(s: String, t: String, n: Int): String =
    require (n >= 0)
    ???


  def approx(c: Double, xn: Double): Double =
    ???

  def approxN(c: Double, xn: Double, n: Int): Double =
    require(n >= 0)
    ???

  def approxErr(c: Double, xn: Double, epsilon: Double): Double =
    require (epsilon > 0)
    ???

  def root(c: Double): Double =
    approxErr(c, 1.0, 0.0001)


end hw01