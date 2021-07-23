package com.zexing.day01

import scala.io.StdIn

object TestInput {
  def main(args: Array[String]): Unit = {

    println("name:")
    var name=StdIn.readLine()

    println("age:")
    var age=StdIn.readShort()

    println("sal:")
    var sal=StdIn.readDouble()

    println(s"name: ${name},aga:${age},sal:${sal}")
  }

}
