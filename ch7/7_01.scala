
def mergeSort (xs:List[Int]):List[Int] = {
  def merge (left:List[Int], right:List[Int]):List[Int] =
    (left, right) match {
      case (_, Nil) => left
      case (Nil, _) => right
      case _ => if (left.head < right.head)
                  left.head :: merge (left.tail, right)
                else
                  right.head :: merge (left, right.tail)
    }


  xs.length match {
    case len if (len <= 1 ) => xs
    case other => {
      val (left, right) = xs.splitAt (other/2)
      merge (mergeSort (left), mergeSort (right))
    }

  }
}

println (
mergeSort (List (23, 2, 96, 86, 123, 45, 5332, 44, 2, 4, 6, 10, 6, 167, 23, 245))
)
