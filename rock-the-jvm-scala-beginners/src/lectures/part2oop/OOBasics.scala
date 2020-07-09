package lectures.part2oop

object OOBasics extends App{
  val person = new Person("John Doe", 26)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}


// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2
  println( 1 + 3)

//  methode
  def greet(name: String): Unit = println(s"${this.name} says: hi $name")

//  overloading
  def greet(): Unit = println(s"Hi, I am $name")


//  multiple constructor
  def this(name: String) = this(name, 0)
  def this() = this("John Doe ")

}

// class parameter are NOT FIELD