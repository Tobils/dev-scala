package lectures.part1basics

object Expresions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(1 + 3 + 5)
  // +- * / & | ^ << >> >>>> (right shift with zero extension)

  println( 1 == x)
  // == != > >= <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with *= -= /=
  println(aVariable)

  // Instructions vs Expressions

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  var i = 0
  val aWhile = while (i < 10){
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in scala is an Expression !

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world") ?
  // 2.
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someValue)
  println(someOtherValue)
}
