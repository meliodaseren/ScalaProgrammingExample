
trait SomeUndefined {

  val a = 0
  val b:Int
  def f (x:Int):Int
}


abstract class A extends SomeUndefined {
  val b = 3
}

class B extends SomeUndefined {
  val b = 4
  def f (x:Int) = x+1
}

val b = new B
