

class Stack[T] {
  var elements: List[T] = Nil
  def push(x: T) { elements = x :: elements }
  def top: T = elements.head
  def pop() { elements = elements.tail }
}


