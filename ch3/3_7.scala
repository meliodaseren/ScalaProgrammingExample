
object EnumWeekDay5 extends Enumeration {
  type EnumWeekDay5 = Value
  val Mon, Tue, Wed, Thr, Fri, Sat, Sun = Value
}

import EnumWeekDay5._

val d:EnumWeekDay5 = EnumWeekDay5.Thr

def checkDay (day:EnumWeekDay5) = day match {
    case Mon => println ("It is Monday.")
    case other => println ("Other day.")
}

checkDay (d)
