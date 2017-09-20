
sealed abstract class Weekday

case object Mon extends Weekday
case object Tue extends Weekday
case object Wed extends Weekday
case object Thr extends Weekday
case object Fri extends Weekday
case object Sat extends Weekday
case object Sun extends Weekday

object Weekday {
  val values = List (Mon, Tue, Wed, Thr, Fri, Sat, Sun)
}

def matchDay (d: Weekday) = d match {
  case Sat => "Weekend"
  case Sun => "Weekend"
  case other => "Working day"
}

println (Weekday.values)
println (Weekday.values.map (matchDay)) 
