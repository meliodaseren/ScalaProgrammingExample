//8_5.scala

case class Teacher (name:String, dept:String, age:Int)

val teachers = Map ("Jimmy"->Teacher ("Jimmy", "CS", 33),
                    "Tom"->Teacher ("Tome", "EE", 45),
                    "Marry"->Teacher ("Marry", "MATH", 28))

def deptOf (name:String):Option [String] =
  teachers.get (name) map {_.dept}


println (deptOf ("Tom"))
println (deptOf ("xx"))
