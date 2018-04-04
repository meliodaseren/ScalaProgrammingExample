// 11_09.scala

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

