// 8_4.scala

def average (list: List[Double]):Option[Double] =
  if (list.isEmpty)
    None
  else
    Some (list.sum/list.size)

val a = average (List (1.2, 3.3, 2,3))

if (a.isDefined)
  println (a.get)
else
  println ("It is empty")


a match {
  case Some(value) => println (value)
  case None => println ("It is empty")
}

println (a.getOrElse ("It is empty"))
println (average (List ()).getOrElse ("It is empty"))

