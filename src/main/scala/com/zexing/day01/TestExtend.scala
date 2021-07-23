package com.zexing.day01

object TestExtend {
  def main(args: Array[String]): Unit = {
    val emp = new Emp("joson",11,1001)
  }

}
class Person1(nameParam: String) {
  var name = nameParam
  var age: Int = _
  println(" 父类主构造器")
  def this(nameParam: String, ageParam: Int) {
    this(nameParam)
    this.age = ageParam
    println(" 父类辅助构造器")
  }
}
class Emp(nameParam: String, ageParam: Int) extends Person1(nameParam, ageParam) {
  var empNo: Int = _

  def this(nameParam: String, ageParam: Int, empNoParam: Int) {
    this(nameParam, ageParam)
    this.empNo = empNoParam
    println(" 子类的辅助构造器")
  }
  println(" 子类主构造器")
}