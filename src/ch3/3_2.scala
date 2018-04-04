import scala.math._

abstract class GeoObj {
  def dim = 0
}

class Point2D (val x:Double=0.0, val y:Double=0.0) extends GeoObj {
  override def dim = 2
  def distance (p:Point2D) = sqrt ( (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y))
}

class ColorPoint2D (x:Double, y:Double, val c:String="") extends Point2D(x,y) 

val p = new Point2D
val cp = new ColorPoint2D(1, 1, "red")

println (cp.x)

