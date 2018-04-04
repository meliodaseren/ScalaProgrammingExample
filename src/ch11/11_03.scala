// 11_03.scala


def be (right: Any): Any => Boolean = {
  left: Any => (left == right)
}

implicit class ShouldBeTest[A] (left: A) {
  def should (be: Any => Boolean): Unit = {
    if (! be (left)) 
      throw new AssertionError ("SholdBe test failed.")  
    
  }
}


case class Employee (id:Int, name:String)

Employee (101, "Tom") should be (Employee (101, "Tom"))
Employee (101, "Tom") should be (Employee (201, "Tom"))
