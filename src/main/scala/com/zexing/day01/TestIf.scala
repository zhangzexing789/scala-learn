package com.zexing.day01

import scala.io.StdIn

object TestIf {
  def main(args: Array[String]): Unit = {
    println("age:")
    val age = StdIn.readInt()
    val result:String = if (age>30){
      "老人"
    }
    else{
      "年轻人"
    }
    println(result)

    println("age:")
    val age1 = StdIn.readInt()
    val result1:String = if (age1>30) "老人" else "年轻人"
    println(result1)
  }
}
