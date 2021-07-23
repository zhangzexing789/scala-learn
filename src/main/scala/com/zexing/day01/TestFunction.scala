package com.zexing.day01

object TestFunction {
  def main(args: Array[String]): Unit = {

    def test1(): Unit = {
      println("无参，无返回值")
    }

    def test2(): String = {
      "String"
    }
    println(test2())

    def test3(String: String): Unit={

      println("String")
    }
    test3("Joson")

    def test4(s: String): String={
      s
    }

    println(test4("Joson"))

    def test5(name: String,age: Int): Unit={
      println(s"name:${name},age:${age}")
    }
    test5("Joson",26)

  }

}
