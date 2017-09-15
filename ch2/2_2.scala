import scala.math._

class Point2D (val x:Double=0.0, val y:Double=0.0) {
  def dim = 2
  def distance (p:Point2D) = sqrt ( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y))
}

val p1 = new Point2D
val p2 = new Point2D (1.0, 1.0)

println ("p1's dimention :" + p1.dim)
println ("The distance between p1 and p2 :" + (p1 distance p2))


class Line2D (val p1:Point2D, val p2:Point2D) {
  val mid:Point2D = new Point2D ((p1.x+p2.x)/2, (p1.y+p2.y)/2)
}


val l = new Line2D (p1, p2)
println ("The mid point of l: (" + l.mid.x + "," + l.mid.y + ")") 
