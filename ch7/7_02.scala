
sealed trait MyList[+A]

case object Nil extends MyList[Nothing]
case class Cons[+A](head: A, tail: MyList[A]) extends MyList[A]

object MyList {
  def apply[A](as: A*): MyList[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))

  //Methods of MyList......
  def tail[A] (list:MyList[A]):MyList[A] = list match {
    case Nil => sys.error ("tail: empty list")
    case Cons (_, t) => t
  }

  def init[A] (list:MyList[A]):MyList[A] = list match {
    case Nil => sys.error ("init: empty list")
    case Cons (_, Nil) => Nil
    case Cons (h, t) => Cons (h, init (t))
  }
  
  def foldLeft[A, B] (list:MyList[A], z:B) (f:(B, A)=>B): B = list match {
    case Nil => z
    case Cons (h, t) => foldLeft (t, f (z, h))(f)
  }

  def length[A] (list:MyList[A]):Int = foldLeft (list, 0) {(x, y)=>x+1}
  def reverse[A] (list:MyList[A]):MyList[A] = 
        foldLeft (list, List[A]()) { (x, y) => Cons (y, x)}

  def foldRight[A, B] (list:MyList[A], z:B) (f:(A, B) => B) =
        foldLeft (reverse (list), z) ( (b, a) => f (a, b))

  def map[A, B] (list:MyList[A])(f:A=>B) = 
        foldLeft (reverse(list), MyList[B]()) {(x, y) => Cons (f(y), x)}
  
  def filter[A] (list:MyList[A])(f:A=>Boolean) = 
        foldLeft (reverse(list), MyList[A]()) {(x, y) => if (f(y)) Cons (y, x) else x}

  def head[A] (list:MyList[A]) = list match {
    case Nil => sys.error ("head: empty list")
    case Cons (h, _) => h
  }

  def nfpReverse[A] (list:MyList[A]):MyList[A] = {
    var result: MyList[A] = Nil
    var tmp = list
    while (length (tmp) != 0) {
      result = Cons (head (tmp), result)
      tmp = tail (tmp)
    }
    result
  }
}


object main extends App {

  val l = MyList (1, 2, 3, 4, 5)
  println (l)
  println ("head: " + MyList.head (l))
  println ("tail: " + MyList.tail (l))
  println ("init: " + MyList.init (l))
  println ("foldLeft: " + MyList.foldLeft (l, 10) { _ + _})
  println ("length: " + MyList.length (l))
  println ("reverse: " + MyList.reverse (l))
  println ("nfpReverse: " + MyList.nfpReverse (l))
  println ("map: " + MyList.map (l) { _+10})
  println ("filter: " + MyList.filter (l) { _ > 3})

}


