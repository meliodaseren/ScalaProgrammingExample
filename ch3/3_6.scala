
object EnumWeekDay4 {
  type EnumWeekDay4 = Int

  private var nextId = 0

  def Value:Int = {nextId += 1; nextId}

  val Mon, Tue, Wed, Thr, Fri, Sat, Sun = Value
}

import EnumWeekDay4._

val d2:EnumWeekDay4 = EnumWeekDay4.Thr

def checkDay (day:EnumWeekDay4) = day match {
    case Mon => println ("It is Monday.")
    case other => println ("Other day.")
}

checkDay (d2)
