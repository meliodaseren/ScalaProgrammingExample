
def throwExceptionF (x:Int):Int = {

  val z = throw new Exception ("exception")

  val y = 30
  x + y + z
}



def half (n:Int) = {
  try {
   if (n % 2 == 0)
     n/2
   else
     throw new RuntimeException (" input is not even")
  } catch {
    case ex: RuntimeException => println ("Exception happened") 
  }
}


val a = half (10)
val b = half (5)

println (a)
println (b)

val c = throwExceptionF (3)
println (c)

