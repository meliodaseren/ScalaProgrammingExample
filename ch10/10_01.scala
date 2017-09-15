// 10_01.scala

import java.util.regex._

def mkPattern (s:String): Option[Pattern]  = 
  try {
    Some (Pattern.compile (s))
  } catch {
    case e: PatternSyntaxException => None
  }

def mkMatcher (s: String): Option[String => Boolean] = 
  mkPattern (s) map (pat => ((str:String) => pat.matcher (str).matches ))


def strMatchPat (s: String, p: String) = 
  mkMatcher (p) map {f => f(s)}

val m1 = mkMatcher ("\\d+")

val r1 = m1 map {f => f("123334")}
println (m1)
println (r1)

println (strMatchPat ("12443", "\\d+"))
println (strMatchPat ("12443d", "\\d+"))
