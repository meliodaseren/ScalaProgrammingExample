class Car (val ABS:Boolean = true,
           val TCS:Boolean = false,
           val Sunroof:Boolean = false) {

    def this (ABS:Boolean, TCS:Boolean) {
      this (ABS, TCS, false)
    }

}

val car = new Car (true, true)
