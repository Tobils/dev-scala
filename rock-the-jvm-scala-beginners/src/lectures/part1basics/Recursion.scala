package lectures.part1basics

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n )
      result
    }
  println(factorial(10))


  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression
    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = and so on ..
  = facHelper(2, 3 * 4 * 5 ... * 10 * 1
   */
  println(anotherFactorial(5000))


  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  /*
    1. Concate a string n times
    2. IsPrime function tail recursive
    3. Fibonaci function, tail recursive
   */

  // 1. concate a string n time
  @tailrec
  def conString(aString: String, n: Int, accumulator: String): String = {
    if(n <= 0) accumulator
    else conString(aString, n-1, aString + accumulator)
  }
  println(conString("suhada", 200000, ""))


  // 2. IsPrime tail recursive
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if ( t <= 1) true
      else isPrimeTailrec(t-1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n/2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  // 3. fibonaci number
  def fibonaci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if( i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
  println(fibonaci(8))




}
