// 8_7.scala

import scala.io.StdIn
import scala.util._

/*
try {
  val denominator = StdIn.readLine ("Denominator: ").toInt
  val divisor = StdIn.readLine ("Divisor: ").toInt
} catch {
  case e: NumberFormatException => println ("Please input a number.")
}
*/

/*
val denominator = Try(StdIn.readLine ("Denominator: ").toInt)

denominator match {
 case Success(v) => println (v)
 case Failure(e) => println ("Not a number")
}
*/

val denominator = Try(StdIn.readLine ("Denominator: ").toInt)
val divisor = Try (StdIn.readLine ("Divisor: ").toInt)

val result = denominator flatMap (x => divisor.flatMap (y => Try (x/y)))
result match {
  case Success (v) => println ("result: " + v)
  case Failure (e) => println (e)
}

