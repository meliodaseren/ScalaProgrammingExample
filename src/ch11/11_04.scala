// 11_04.scala

import scala.math.BigInt
object FibMain extends App {

  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  fibs take 5 foreach println
}

