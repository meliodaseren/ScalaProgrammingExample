// 11_05.scala

import scala.util.Random

def isPrime (n: Int) = n match {
  case a if a < 2 => false
  case b => (for(k <- 2 until n-1) yield n % k) forall (x => x != 0)
}


def try1 ( ) = {
  val numbers = List.fill (1000) {Random.nextInt (1000000)}

  val primes = numbers filter (isPrime)

  (primes take 5) foreach println
}

def try2( ) = {
  var take = 5

  while (take > 0) {

    var findPrime = false
    while (!findPrime) {
      val n = Random.nextInt (1000000)
      if (isPrime (n)) {
        println (n)
        findPrime = true
      }
    }

    take -= 1
  }

}

def try3 ( ) = {
  val stream = Stream.fill (1000) (Random.nextInt (1000000))
  ((stream filter isPrime) take 5) foreach println
}

//try1 ()
//try2 ()
try3 ()
