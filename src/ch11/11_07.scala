// 11_07.scala

class Animal

class Dog extends Animal

class Hound extends Dog


class AnimalHouse[+T] (tenant: T) {
  def inviteFriend [U >: T] (friend:U) = {println ("Send invitation to " + friend)}
}


