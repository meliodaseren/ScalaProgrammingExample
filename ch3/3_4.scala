
def numberToString (x:Int) = {
  x match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case 4 => "Four"
    case _ => "Many"
  }
}

def numberToString2 (x:Int) = {
  x match {
    case 1|2|3 => "One or Two or Three"
    case 4 => "Four"
    case _ => "Many"
  }
}

def parseArgument (arg: String) = {
  arg match {
    case "-h" | "-help" => println ("Manual")
    case "-v:" | "-version" => println ("Version x.x")
    case _ => println ("Unknow argument")
  }
}

println (numberToString (2))
println (numberToString2 (3))

parseArgument ("-version")


def scoreMatch (x:Int) = x match {
  case a if(a > 90) => "A"
  case b if(b >= 80) => "B"
  case other => "C or below"
}

println (scoreMatch (66))


def stockMatch (x:Stock) = x match {
  case a if (a.id == "TSNC" || a.price > 100) => "sell"
  case b if (b.id == "TSNC" || b.price <= 80) => "buy"
  case c => "do nothing"
}


class Stock (val id:String, val price:Int)

val s = new Stock ("TSNC", 150)

println (stockMatch (s))
