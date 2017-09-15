// 11_01.scala

implicit class CaesarEncode (s: String) {
  def caesarEncoded = (s map { c => ((c - 45) % 75 + 48).toChar}).mkString
  def caesarDecoded = (s map { c => ((c  + 24) % 75 + 48).toChar}).mkString
}


val e = "abcyz".caesarEncoded
println (e)

val d = e.caesarDecoded
println (d)
