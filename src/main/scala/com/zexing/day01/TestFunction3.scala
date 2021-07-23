package com.zexing.day01

object TestFunction3 {

  def main(args: Array[String]): Unit = {
    var a:Int = 1
    def f1()= {
      def f2(b:Int):Int = {
        a+b
      }
      f2 _
    }
    //  f1 函数执行完毕后，局部变量 a 应该随着栈空间释放掉。但是scala在调用函数时，会在堆内存创建这个函数的对象实例，并打包保存了所依赖的包和变量，
    val f=f1()
    // 但是在此处，变量 a 其实并没有释放，而是包含在了 f2 函数的内部，形成了闭合的效果
    println(f1()(2))//3
    println(f(3))//4


    def f3(a:Int): Int => Int = a+_

    println(f3(3)(4))

    // 函数柯里化，其实就是将复杂的参数逻辑变得简单化 函数柯里化一定存在闭包
    def f4()(b:Int) = {
      a + b
    }
      println(f4()(3))
  }
}
