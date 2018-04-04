sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color

def displayColor (c:Color) = c match {
  case Red => println ("Color: Red") 
  case Green => println ("Color: Green")
  case Blue => println ("Color: Blue")
}


displayColor (Green)
