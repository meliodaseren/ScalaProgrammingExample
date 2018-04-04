// 11_06.scala

import scala.util.Try

object IPAddress {

  def unapply (ip: String): Option [(Int, Int, Int, Int)] = {
    val tokens = ((ip.split ("\\.")) flatMap {
         s => Try(s.toInt).toOption}) filter {
           i => i >= 0 && i <= 255}

   if (tokens.length == 4) 
     Some (tokens(0), tokens(1), tokens(2), tokens(3))
   else
     None

  }
}

def testIP (ip: String) = ip match {
  case IPAddress (a, b, c, d) => print (s"$a:$b:$c:$d\n")
  case _ => println ("not a valid IP.")
}

testIP ("140.123.1.1")
testIP ("124.345.1.2")
testIP ("78a.1.2.3")   



object IPAddresses {
  def unapplySeq(ips:String): Option[Seq[String]] = {
    Some(ips split ",")
  }
}

val ips = "140.120.0.1,140.120i.0.2,140.120.0.3"

ips match {
  case IPAddresses(IPAddress(a, _, _, _), IPAddress(b, _, _, _), _*) => println (s"IP 1: $a, IP 2:$b")
  case _ => "Invalid IP addresses"
}

ips match {
  case IPAddresses(a @ _*) => a foreach testIP 
  case _ => "Invalid IP addresses"
}





   
