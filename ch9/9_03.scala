
sealed trait Option[+A]
case class Some[+A](get:A) extends Option[A]
case object None extends Option[Nothing]


def average (list: List[Double]):Option[Double] = 
  if (list.isEmpty)
    None
  else
    Some (list.sum/list.size)


println (average (List (1.2, 2.3, 2,4)))
println (average (List ()))

