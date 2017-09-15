// 11_10.scala

type F[N] = N => N
type NUM [N] = F[N] => N => N

def zero[N]: NUM[N] = f => n => n
 
def succ[N] (num: NUM[N]): NUM[N] =
      (f: F[N]) => (n:N) => f (num(f)(n))

def one[N] = succ (zero[N])
def two[N] = succ (one[N])
def three[N] = succ (two[N])

def add[N] (x: NUM[N], y: NUM[N]) = {
  (f: F[N]) => (n:N) => x(f)(y(f)(n))
}

def showNumValue : NUM[Int] => Int = 
  num => num (x => x+1)(0)

def showNumString: NUM[String] => String =
  num => num(s => s+"o") ("")

type PAIR[N] = Tuple2[NUM[N], NUM[N]]

/*
def phi[N] (pair: PAIR[N]): PAIR[N] =
  (succ (pair._1), pair._1)
*/

def phi[N]: PAIR[N] => PAIR[N] = 
  p => (succ(p._1), p._1)

def pred[N] (num: NUM[PAIR[N]]): NUM[N] = 
  ( num (phi[N])((zero[N], zero[N])) )._2



//======================================
//Exercise
def time[N]:NUM[N] => NUM[N] => NUM[N] =
  x=>y=>f=>n=>x(y(f))(n)

 
type BOOLEAN[T] = T => T => T
//def TRUE[T] (a:T) (b:T): T = a
//def FALSE[T] (a:T) (b:T): T = b

def TRUE[T]: BOOLEAN[T] = a => b => a
def FALSE[T]: BOOLEAN[T] = a => b => b

def isZero[N]: NUM[N] => BOOLEAN[N] = x => a=>b=> x (xx=>b)(a)


