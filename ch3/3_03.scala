
abstract class Animal {
  def eat ():Unit
}

class Cat extends Animal {
  override def toString = "I am a cat."
  override def eat ():Unit = println ("eat cat food")
}

class Dog extends Animal {
  override def toString = "I am a dog."
  override def eat ():Unit = println ("eat dog food")
}


val a1:Animal = new Cat
val a2:Animal = new Dog

println (a1.toString)
a1.eat ()

println (a2.toString)
a2.eat ()
