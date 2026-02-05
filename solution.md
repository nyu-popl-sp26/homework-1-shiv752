## Solution to Problem 1

(a)

The use of pi at line 4 is bound at line 3. At line 3, pi is redefined within the scope of the function "circumference" to equal 3.14159. Line 4 is within this same scope, and therefore uses the value bound at line 3.

The use of pi at line 7 is bound at line 1. Line 7 is outside the scope of the function "circumference", so it cannot see the binding at line 4 and utilizes the val pi as bound in line 1.

(b)

The use of x at line 3 is bound at line 2. x is redefined at line 2 to refer to the single argument of type Int taken by the function.

The uses of x at line 6 and 10 are bound at line 5. Using the variable x in the pattern-matching case at line 5 binds the value of the object being matched to x (in this case, this object happens to be one that was also earlier defined as x). The binding in line 8 is not seen (since it is contained in a narrower scope), so both lines 6 and 10 "see" the binding at line 5.

The uses of x at line 11 are bound at line 1. Lines 2 through the 10 are within the scope of the function "f". Therefore, the only binding of x visible from the code in line 11 is the binding in line 1.

## Solution to Problem 2

(a) Execution trace:

```
pow(2,3)
-> if 3 > 0 then 2 * pow(2, 3 - 1) else 1
-> if true then 2 * pow(2, 3 - 1) else 1
-> 2 * pow(2, 3 - 1)
-> 2 * pow(2, 2)
-> 2 * (if 2 > 0 then 2 * pow(2, 2 - 1) else 1)
-> 2 * (if true then 2 * pow(2, 2 - 1) else 1)
-> 2 * (2 * pow(2, 2 - 1))
-> 2 * (2 * pow(2, 1))
-> 2 * (2 * (if 1 > 0 then 2 * pow(2, 1 - 1) else 1))
-> 2 * (2 * (if true then 2 * pow(2, 1 - 1) else 1))
-> 2 * (2 * (2 * pow(2, 1-1)))
-> 2 * (2 * (2 * pow(2, 0)))
-> 2 * (2 * (2 * (if 0 > 0 then 2 * pow(2, 0 - 1) else 1)))
-> 2 * (2 * (2 * (if false then 2 * pow(2, 0 - 1) else 1)))
-> 2 * (2 * (2 * (1)))
-> 8
```

(b) Tail-recursive implementation

```scala
def powTail(x: Int, n: Int): Int = {
    def powHelper(x: Int, n: Int, acc: Int): Int = 
      if (n == 0) then acc else powHelper(x, n - 1, acc * x)
    powHelper(x, n, 1)
}
```

Execution trace:

```
powTail(2, 3)
-> powHelper(2, 3, 1)
-> if n == 0 then 1 else powHelper(2, 3 - 1, 1 * 2)
-> if false then 1 else powHelper(2, 3 - 1, 1 * 2)
-> powHelper(2, 3 - 1, 1 * 2)
-> powHelper(2, 2, 2)
-> if n == 0 then 2 else powHelper(2, 2 - 1, 2 * 2)
-> if false then 2 else powHelper(2, 2 - 1, 2 * 2)
-> powHelper(2, 2 - 1, 2 * 2)
-> powHelper(2, 1, 4)
-> if n == 0 then 4 else powHelper(2, 1 - 1, 4 * 2)
-> if false then 4 else powHelper(2, 1 - 1, 4 * 2)
-> powHelper(2, 1 - 1, 4 * 2)
-> powHelper(2, 0, 8)
-> if n == 0 then 8 else powHelper(2, 0 - 1, 8 * 2)
-> if true then 8 else powHelper(2, 0 - 1, 8 * 2)
-> 8

```