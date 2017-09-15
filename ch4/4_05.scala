

def sort(xs: Array[Int]): Array[Int] = {
  if (xs.length <= 1) xs else {
    val pivot = xs(xs.length / 2)
    Array.concat(
      sort(xs filter (pivot >)),
      xs filter (pivot ==),
      sort(xs filter (pivot <)))
  }
}

val a = Array (100, 20, 30, 45, 10, 20, 15, 10, 60, 30)


val startTime = System.nanoTime
sort (a)
val stopTime = System.nanoTime

println ("The total comsuming time: " +  (stopTime - startTime)/1000000 + "ms")

def runTime [T] (code: => T):T = {
  val startTime = System.nanoTime
  val result = code
  val stopTime = System.nanoTime
 
  println ("The total comsuming time: " + (stopTime - startTime)/1000000 + "ms")
  result
}

runTime (sort (a))
