package com.zexing.day01

//伴生类
class Student(name: String, age: Int) {
  def printinfo(): Unit = {
    println("name:" + name + " " + "age:" + age + " " + "school:" + Student.school)
  }
}

//伴生对象
object Student {
  val school = "school_name"

  def main(args: Array[String]): Unit = {
    val mike = new Student("mike", 18)
    val tom = new Student("tom", 22)
    mike.printinfo()
    tom.printinfo()
  }
}