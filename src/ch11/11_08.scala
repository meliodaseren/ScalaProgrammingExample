// 11_08.scala

type BOOLEAN[T] = T => T => T

def TRUE[T]: BOOLEAN[T] = a => b => a
def FALSE[T]: BOOLEAN[T] = a => b => b 


def not[T] (bool:BOOLEAN[T])(a:T)(b:T) = bool(b)(a)
def and[T] (b1:BOOLEAN[T])(b2:BOOLEAN[T])(a:T)(b:T) = b1(b2(a)(b)) (b)
def or[T] (b1:BOOLEAN[T])(b2:BOOLEAN[T])(a:T)(b:T) = b1(a)(b2(a)(b))


type BinaryBoolOp[T] = BOOLEAN[T]=>BOOLEAN[T]=>BOOLEAN[T]

def showBoolValue (b: BOOLEAN[Boolean]) = b(true)(false).toString

def makeTruthTable (op: BinaryBoolOp[Boolean]) = {
  val tf = List (TRUE[Boolean], FALSE[Boolean])

  for (a <- tf;
       b <- tf) {
    println (showBoolValue (a) + " \t " + 
             showBoolValue(b)  + "\t" +
             showBoolValue (op (a)(b)))

  }
}

println ("and Truth Table:")       
makeTruthTable (and)

println ("\nor Truth Table:")
makeTruthTable (or)

println ("\nnot Truth Table:")
println (showBoolValue (TRUE[Boolean]) + " \t " + showBoolValue( not (TRUE[Boolean])))
println (showBoolValue (FALSE[Boolean]) + " \t " + showBoolValue( not (FALSE[Boolean]))) 



