
abstract class Bird

trait Swimming {
 val a = 2
val b = 2+3
a+b
  def swim()
}

trait Flying {
  def fly()
}


class Hawk extends Bird with Flying {
  def fly () = println ("I am doing Hawk's flying.")
}

class Penguin extends Bird with Swimming {
  def swim () = println ("I am doing Penguin's swimming")
}

class Pelican extends Bird with Flying with Swimming {
  def fly () = println ("I am doing Pelican's flying")
  def swim () = println ("I am doing Pelican's swimming")
}

class Chicken extends Bird

val pelican = new Pelican
pelican.fly ()
pelican.swim ()


