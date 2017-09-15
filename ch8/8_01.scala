

def combination (n:Int, set: Set[Any]):Set[Set[Any]] = {
  n match {
    case 0 => Set (Set ())
    case `n` => {
      for ( x <- set;
            nos = set - x;
            ys <- combination (n-1, nos))
        yield {ys + x}
    }
  }
}

val s = combination (3, Set (1, 2, 3, 4, 5))

println (s)

