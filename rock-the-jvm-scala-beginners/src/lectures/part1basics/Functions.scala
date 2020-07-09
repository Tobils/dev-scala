package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function 1 * 2 * 3 * .. * n
    3. A fibonaci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. Tests if a number is prime
   */

  // 1. GREETING FUNCTION
  def greeting(name: String, age: Int) = {
    println("Hi, my name is "+ name + " and I am "+ age + " years old.")
  }
  greeting("Ade Suhada",26)


  // 2. FACTORIAL FUNCTION
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }
  println(factorial(5))

  // 3. FIBONACI FUNCTION
  def fibonaci(n: Int): Int = {
    if (n <= 2) 1
    else fibonaci(n-1) + fibonaci(n-2)

    // 1 1 2 3 5 8 ...
  }
  println(fibonaci(10))

  // 4. A FACTORIAL TEST FUNCTION
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t<= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }

    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))

}
