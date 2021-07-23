package com.zexing.day01

object TestCharType {

  def main(args: Array[String]): Unit = {
    var name: String = "jianlian"
    var age: Int = 19

    println(name + " " +age)

    printf("name=%s age=%d\n",name,age)

    val string=
      """
        |select *
        |from table
        |where name='jian'
        |""".stripMargin
    println(string)

    val string2=
      s"""
        |select *
        |from table
        |where age = ${age+1}
        |""".stripMargin

    println(string2)

    val string3= s"name:${name}"
    println(string3)
  }
}
