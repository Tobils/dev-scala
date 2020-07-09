package lectures.part1basics

object CBNvsCBV extends App{
  def calledByValue(x: Long): Unit = {
    println("By value : " + x)
    println("By value : " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("By name : " + x)
    println("By name : " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34) ERROR
  printFirst(34, infinite())

}
