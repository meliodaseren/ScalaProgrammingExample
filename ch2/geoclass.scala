import scala.math._

class Point2D {
  var x = 0.0
  var y = 0.0
  
  def dim = 2
  def distance (p:Point2D) = sqrt ( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y))
}


val p1 = new Point2D
val p2 = new Point2D
p2.x = 1.0
p2.y = 1.0

println ("p1's dimention :" + p1.dim)
println ("The distance between p1 and p2 :" + (p1 distance p2))

