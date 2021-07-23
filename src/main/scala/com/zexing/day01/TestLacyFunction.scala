package com.zexing.day01

object TestLacyFunction {
  def main(args: Array[String]): Unit = {
    lazy val result2=sum(1,2)
    println("result2:"+result2)
  }

  def sum(a: Int,b: Int):Int={
    println("调用sum函数")
    a+b
  }
}
