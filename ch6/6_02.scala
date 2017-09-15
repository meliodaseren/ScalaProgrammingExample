
class Machine (job:String) {
  def work = println ("doing " + job)
  def work2 = println ("doing " + job + " another way")
  def clean = println ("Machine: "+ job + " cleaned")
}

object MakerStore {

  def rentMachine (s:String) = new Machine (s)
  
  def doJob (s:String) (op: Machine => Unit) {
    val machine = rentMachine (s)
    op (machine)
    
    machine.clean
  } 
}


MakerStore.doJob ("my job") {
   machine => {
     for (i <- 1 to 5)
       machine.work
   }
}


