package com.zexing.day01

object TestFunction2 {
  def main(args: Array[String]): Unit = {
    def foo()=println("foo")

    val f=foo
    println(f)

    val f1=foo _
    println(f1)

    println("匿名函数")
    // 定义一个参数包含数据和函数的函数
    def operation(array: Array[Int],op: Int => Int) ={
      for (i <- array) yield op(i)
    }
    // 定义函数
    def op(ele: Int): Int={
      ele+1
    }
    // 标准函数调用
    val result=operation(Array(1,2,3),op)
    println(result.mkString(","))

    // 匿名函数调用
    val result1=operation(Array(1,2,3),(ele:Int)=> {ele+1})
    println(result1.mkString(","))

    // 参数的类型可以省略，会根据形参进行自动的推导
    val result2=operation(Array(1,2,3),(ele)=> {ele+1})
    println(result2.mkString(","))

    //类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过 1 的永远不能省略圆括号。
    //匿名函数如果只有一行，则大括号也可以省略
    val result3=operation(Array(1,2,3),ele=> ele+1)
    println(result3.mkString(","))

    //如果参数只出现一次，则参数省略且后面参数可以用_代替
    val result4=operation(Array(1,2,3),_ +1)
    println(result4.mkString(","))

    println("两个参数")

    def calculate(a:Int,b:Int,add:(Int,Int) => Int):Int={
      add(a,b)
    }
    println(calculate(1,2, _ +_))

  }
}
