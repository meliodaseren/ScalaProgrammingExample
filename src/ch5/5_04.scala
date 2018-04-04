

def permu (l:List[Any]) = {
  def genPerm (l:List[Any]):List[List[Any]] = l match {
    case Nil => List (List ()) 
    case x::ys => { //println (x + ", " + y)
      for ( ly <- genPerm (ys);
            i <- 0 to ly.length
          ) yield {ly.take(i)::: (x::ly.drop(i))}


    } 

  }

  genPerm (l)

}

println (permu (List ()))
println (permu (List (1)))
println (permu (List (1, 2)))

println (permu (List (1,2,3)))
//println (permu (List (1, 2, 3, 4, 5)))
println (permu (List (1, 2, 3, 4)))

