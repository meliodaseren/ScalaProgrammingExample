// ======= trait Amount ======
object Quantity extends Enumeration {
  type Quantity = Value
  val Zero, Small, Medium, Large, ExtraLarge = Value
}
import Quantity._ 

trait Amount {
  val quantity:Quantity
}

// ====== trait Flavor =======
trait Flavor

object IceCreamFlavor extends Enumeration {
  case class FlavorVal () extends Val with Flavor

  type IceCreamFlavor = FlavorVal

  val Vanilla, Strawberry, Chocolate = FlavorVal ()
}

import IceCreamFlavor._

object ChipFlavor extends Enumeration {
  case class FlavorVal () extends Val with Flavor

  type ChipFlavor = FlavorVal
  
  val Corn, Chocolate, Potato = FlavorVal ()
}

import ChipFlavor._

object SauceFlavor extends Enumeration {
  case class FlavorVal () extends Val with Flavor

  type SauceFlavor = FlavorVal

  val Sugar, Maple, CondensedMilk = FlavorVal ()
}
import SauceFlavor._

object DrinkFlavor extends Enumeration {
  case class FlavorVal () extends Val with Flavor

  type DrinkFlavor = FlavorVal

  val BlackTea, Coffee, Coke = FlavorVal ()
}
import DrinkFlavor._



// ====== trait Taste ======
trait Taste[F <: Flavor] extends Amount {
  val flavor:F
}

// ====== trait OnTop ======
trait OnTop

// ====== IceCream ======
case class IceCream (quantity:Quantity, flavor:IceCreamFlavor)
extends Taste[IceCreamFlavor]

// ====== Chip ======
case class Chip (quantity:Quantity, flavor:ChipFlavor)
extends Taste[ChipFlavor] with OnTop

// ====== Sauce ======
case class Sauce (quantity:Quantity, flavor:SauceFlavor)
extends Taste[SauceFlavor] with OnTop

// ====== Drink ======
case class Drink (flavor:DrinkFlavor) extends Flavor 

// ====== Milk ======
case class Milk (quantity:Quantity) extends Amount


//val drink = Drink (Coke)
//val chip  = Chip (Small, Corn)

// =======================================
//   FloatDrink
// =======================================

case class FloatDrink (drink:Drink, milk:Milk, 
    icecreams:List[IceCream], tops:List[OnTop])

val floatCoke = FloatDrink (Drink(Coke), null, 
        List (IceCream (Medium, Vanilla), IceCream (Medium, IceCreamFlavor.Chocolate)),
        List (Chip (Small, Corn)))

case class IceCreamDish (icereams:List[IceCream], sauce:Sauce, chip:Chip)

val iceCreamDish = IceCreamDish (
    List (IceCream (Large, IceCreamFlavor.Chocolate), IceCream (Large, Strawberry)),
    Sauce (Medium, Maple),
    Chip (ExtraLarge, Potato))
                                 
