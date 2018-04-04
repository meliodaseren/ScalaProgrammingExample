
trait ERRORCODE
case object SUCCESS extends ERRORCODE
case object EMPTY_LIST extends ERRORCODE

def average02 (list: List[Double]):Tuple2[ERRORCODE, Double] = 
  if (list.isEmpty)
    (EMPTY_LIST, 0) 
  else
    (SUCCESS, list.sum/list.size)


val result = average02 (List (1.0, 3.3, 2.2))

result match {
  case (SUCCESS, ave) => println (ave)
  case (EMPTY_LIST, _) => println ("empty list")
}


