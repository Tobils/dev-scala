package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  //  VALS ARE IMMUTABLE
  // COMPILER can infer types
  val aString: String = "Assalamualaikum"
  val snotherString = "uhuy"

  val aBoolean: Boolean = false
  val aChar: Char = 'T'
  val anInt: Int = x
  val aShort: Short = 4556
  val aLong: Long = 42769426794L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects
}
