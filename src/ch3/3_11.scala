
sealed abstract class Expression

sealed abstract class D3 extends Expression

case object E extends D3
case object R extends D3
case object RR extends D3
case object S extends D3
case object RS extends D3
case object RRS extends D3

case class Mult (x:Expression, y:Expression) extends Expression

def eval (expr:Expression):D3 = expr match {
  case x:D3 => x 
   
  case Mult (R, R) => RR
  case Mult (R, RR) => E
  case Mult (R, S) => RS
  case Mult (R, RS) => RRS
  case Mult (R, RRS) => S
  
  case Mult (RR, R) => E
  case Mult (RR, RR) => R
  case Mult (RR, S) => RRS
  case Mult (RR, RS) => S
  case Mult (RR, RRS) => RS

  case Mult (S, R) => RRS
  case Mult (S, RR) => RS
  case Mult (S, S) => E 
  case Mult (S, RS) => RR
  case Mult (S, RRS) => R

  case Mult (RS, R) => S
  case Mult (RS, RR) => RRS 
  case Mult (RS, S) => R
  case Mult (RS, RS) => E
  case Mult (RS, RRS) => RR

  case Mult (RRS, R) => RS
  case Mult (RRS, RR) => S
  case Mult (RRS, S) => RR
  case Mult (RRS, RS) => R
  case Mult (RRS, RRS) => E

  case Mult (E, y) => eval (y)
  case Mult (x, E) => eval (x)
  //case Mult (x, y) =>  {println ("m1"); eval (Mult (eval (x), eval (y))) }
  case Mult (x, y) =>  eval (Mult (eval (x), eval (y))) 

}

val ex1 = Mult (E, S)
val ex2 = Mult (RS, E) 
val ex3 = RRS
val ex4 = Mult (R, RRS)
val ex5 = Mult (R, Mult (R, Mult (R, S)))
val ex6 = Mult (RRS, Mult (R, S))
val ex7 = Mult (ex6, ex5)

println (eval (ex1))
println (eval (ex2))
println (eval (ex3))
println (eval (ex4))
println (eval (ex5))
println (eval (ex6))
println (eval (ex7))

val s1 = "RRRSSRESR".toList map {case 'R'=>R; case 'S'=>S; case 'E'=>E}
//val s1 = "R".toList map {case 'R'=>R; case 'S'=>S; case 'E'=>E}

//val ex8 = s1 reduceLeft Mult.apply 
val ex8 = s1 reduceRight Mult.apply

println (s1)
println (ex8)

println (eval (ex8))
