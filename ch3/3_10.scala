import scala.language.implicitConversions

sealed abstract class PrimaryColor

case class Red (value:Int) extends PrimaryColor
case class Green (value:Int) extends PrimaryColor
case class Blue (value:Int) extends PrimaryColor

sealed abstract class RGBColor
case class RGB (red:Red, green:Green, blue:Blue) extends RGBColor


implicit def intToRed (i:Int) = Red (i)
implicit def intToGreen (i:Int) = Green (i)
implicit def intToBlue (i:Int) = Blue (i)


val black = RGB (0, 0, 0)
val purple = RGB (160, 30, 240)


