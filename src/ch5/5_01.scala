
def factorialWhile (n:Int) = {
  var r = 1
  var i = n

  while (i > 0) {
    r *= i
    i = i - 1
  }
  r
}

println (factorialWhile (10))

