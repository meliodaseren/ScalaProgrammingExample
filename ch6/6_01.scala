case class Box (var h:Int, var w:Int)

  
object Timer {
  val box = Box (30, 30)
  
  def makeBoxSizer (h:Int, w:Int) = {
    def sizer = {box.h = h; box.w = w}
    sizer _
  }

  def sizer20_20 = makeBoxSizer (20, 20)
  def sizer80_80 = makeBoxSizer (80, 80)


  def loop (callback1:()=>Unit, callback2:()=>Unit) = {
    while (true) {
      callback1 ()
      println (box)
      Thread.sleep (1000)
      
      callback2 ()
      println (box)
      Thread.sleep (1000)
    }
  }

  def main (args:Array[String]) = {
    loop (sizer20_20, sizer80_80)
  }

}

