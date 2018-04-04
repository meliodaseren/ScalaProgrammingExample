// 8_6.scala

def average (list: List[Double]): Option[Double] =
  if (list.isEmpty)
    None
  else
    Some (list.sum/list.size)


def variance (list: List[Double]): Option[Double] = 
  average (list) flatMap (u => average (list map (x => math.pow (x - u, 2))))


println (variance (List (1.2, 1.3, 1,2, 1,1)))

