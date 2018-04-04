

val s = "Hello, welcom to Scala's world."

var i = 0
var found = false

while (i < s.length && !found) {
  if (s(i) != ' ') print (s(i))
  if (s(i) == 't') found = true
  
  i = i + 1
}

println ()

def searchChar (s:String, c:Char) = {
  def searchAt (i:Int):Int = i match {
    case a if (a >= s.length) => -1
    case b if (s(b) == c) => i
    case _ => searchAt (i + 1)
    
  }

  searchAt (0)
}

println (searchChar (s, 'c'))
println (searchChar (s, 'x'))
