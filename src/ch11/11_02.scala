// 11_02.scala

abstract class CaesarEncode (s: String) {
  def caesarEncoded: String
  def caesarDecoded: String
}

implicit def stringToCaesar (s:String) = new CaesarEncode (s) {
  def caesarEncoded = (s map { 
    c => ((c - 45) % 75 + 48).toChar}).mkString
  def caesarDecoded = (s map { 
    c => ((c  + 24) % 75 + 48).toChar}).mkString
}

val e = "abcyz".caesarEncoded
println (e)

val d = e.caesarDecoded
println (d)


