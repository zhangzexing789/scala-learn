package com.zexing.day01

object TestControl {
  def main(args: Array[String]): Unit = {
    def f=() => {
      println("f.....")
      10
    }
    foo(f())
    foo2({println("foo2...")})
  }

  def foo(a:Int){
    println(a)
    println(a)
  }

  def foo2(a: => Unit): Unit ={
    println(a)
    println(a)
  }


}
