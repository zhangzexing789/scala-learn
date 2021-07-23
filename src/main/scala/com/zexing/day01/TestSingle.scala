package com.zexing.day01

object TestSingle {

  //伴生对象采用 object 关键字声明
  object Person {
    var country: String = "China"
  }
  //伴生对象对应的类称之为伴生类，伴生对象的名称应该和伴生类名一致。
  class Person {
    var name: String = "bobo"
  }

  def main(args: Array[String]): Unit = {
    //伴生对象中的属性和方法都可以通过伴生对象名（类名）直接调用访问。
    println(Person.country)
  }

}
