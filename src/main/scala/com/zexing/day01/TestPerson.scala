package com.zexing.day01

class Person {
  var name: String = _
  var age: Int = _
  println(" 主构造器")
  def this(age: Int) {
    this()
    this.age = age
    println("辅助构造器")
  }

  def this(age: Int, name: String) {
    this(age)
    this.name = name
  }
}

object Person {
  def main(args: Array[String]): Unit = {
    val person2 = new Person(18)
  }
}
