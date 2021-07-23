package com.zexing.day01

/**
 * object 关键字声明一个单例对象（伴生对象）
 */

object helloWorld {
  /*
  main 方法
  def 方法名（参数名称：参数类型）：返回值类型 （Unit 相当于java的void）={方法体（分号非必须的）}
   */
  def main(args: Array[String]): Unit = {
    println("Hello scala!");
    System.out.println("hello java!")
  }
}
