package popl

import org.scalactic.Tolerance._
import org.scalatest.flatspec.AnyFlatSpec
import hw01._

class hw01Spec extends AnyFlatSpec:

  // Check that abs works for negative, positive and zero values

  "abs" should "evaluate to the absolute value of the argument" in {
     assert(abs(2) === 2)
     assert(abs(-2) === 2)
     assert(abs(0) === 0)
  }

  // Check that swap works

  "ar" should "compute the arity of its argument" in {
    assert(ar(123) === 3)
    assert(ar(-123) === 4)
    assert(ar(0) === 1)
    assert(ar(-1) === 2)
    assert(ar(-100) === 4)
  }
  
  // Check that repeat works

  "rep" should "evaluate to repeated concatenation of a string and a separator" in {
    assert(rep("a", "", 3) === "aaa")
    assert(rep("abc", ", ", 3) === "abc, abc, abc")
    assert(rep("a", ",", 1) === "a")
    assert(rep("abc", ",", 1) === "abc")
    assert(rep("abc", " ", 4) === "abc abc abc abc")
    assert(rep("", "", 5) === "")
  }

  "rep" should "evaluate to an empty string when repeated zero times" in {
    assert(rep("abc", ",", 0) === "")
    assert(rep("", "", 0) === "")
  }

  // Check that repeat requires a non-negative repetition amount

  "rep" should "throw an exception when a negative number of repetitions is expected" in {
    intercept[java.lang.IllegalArgumentException] {
      rep("abc", ",", -3)
    }
  }

  // Check that sqrt works.  This requires steps for sqrtStep, sqrtN, and sqrtErr.

  "approx" should "evaluate to one iteration of Newton's method" in {
    assert(approx(4, 1) === 2.0)
    assert(approx(1, 1) === 1.0)
    assert(approx(5, 8) === 5.35 +- 0.01)
  }

  "approxN" should "perform several iterations of sqrtStep" in {
    assert(approxN(8, 1, 2) === 2.46 +- 0.01)
    assert(approxN(8, 1, 6) === 2.0 +- 0.000000001)
    assert(approxN(8, 20, 2) === 8.91 +- 0.01)
    assert(approxN(8, 20, 6) === 2.23 +- 0.01)
  }

  "approxN" should "evaluate to x0 if n is zero" in {
    assert(approxN(4, 1, 0) === 1.0)
    assert(approxN(4, 20, 0) === 20.0)
  }


  "approxErr" should "perform iterations until the error is within epsilon" in {
    assert(approxErr(8, 1, 0.001) === 2.0 +- 0.001)
    assert(approxErr(8, 1, 0.000001) === 2.0 +- 0.000001)
    assert(approxErr(-8, 1, 0.00000001) === -2.0 +- 0.00000001)
    assert(approxErr(0, 1, 0.00000001) === 0.0 +- 0.00000001)
  }


  // Make sure that the functions have the correct requires
  "approxN" should "throw an exception when n is negative" in {
    intercept[java.lang.IllegalArgumentException] {
      approxN(8, 1, -10)
    }
  }


  "approxErr" should "throw an exception when using a non-positive epsilon" in {
    intercept[java.lang.IllegalArgumentException] {
      approxErr(4, 1, -0.01)
    }
    intercept[java.lang.IllegalArgumentException] {
      approxErr(4, 1, 0.0)
    }
  }

