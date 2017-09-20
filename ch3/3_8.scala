import scala.math._

abstract class GeoObj 

case class Point2D (val x:Double=0.0, val y:Double=0.0) extends GeoObj 
case class Circle2D (val center:Point2D, val radius:Double) extends GeoObj
case class Rectangle2D (val p1:Point2D, p2:Point2D) extends GeoObj

def area (s:GeoObj):Double = s match {
  case Point2D (_, _) => 0.0
  case Circle2D (_, r) => Pi*r*r
  case Rectangle2D (p1, p2) => abs (p1.x - p2.x) * abs (p1.y - p2.y)
}

val geolist = List (Circle2D (Point2D(0,0), 3.0), Rectangle2D (Point2D (1, 1), Point2D (3,3)))

geolist.foreach (x=>println (x + "'s area: " + area (x)))
