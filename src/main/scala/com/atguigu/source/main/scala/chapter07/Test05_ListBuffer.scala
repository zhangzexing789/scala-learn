package chapter07

import scala.collection.mutable.ListBuffer

object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 53, 75)

    println(list1)//ListBuffer()
    println(list2)//ListBuffer(12, 53, 75)

    println("==============")

    // 2. 添加元素
    list1.append(15, 62)
    list2.prepend(20)

    list1.insert(1, 19, 22) // 指定位置添加元素

    println(list1)//ListBuffer(15, 19, 22, 62)
    println(list2)//ListBuffer(20, 12, 53, 75)

    println("==============")

    31 +=: 96 +=: list1 += 25 += 11
    println(list1)//ListBuffer(31, 96, 15, 19, 22, 62, 25, 11)

    println("==============")
    // 3. 合并list
    val list3 = list1 ++ list2
    println(list1) //    ListBuffer(31, 96, 15, 19, 22, 62, 25, 11)
    println(list2) //    ListBuffer(20, 12, 53, 75)
    println(list3) //    ListBuffer(31, 96, 15, 19, 22, 62, 25, 11, 20, 12, 53, 75)

    println("==============")

    //list1 ++= list2 // 在list1 合并了list2
    list1 ++=: list2 // 在list2 合并了list1
    println(list1)//ListBuffer(31, 96, 15, 19, 22, 62, 25, 11)
    println(list2)//ListBuffer(31, 96, 15, 19, 22, 62, 25, 11, 20, 12, 53, 75)

    println("==============")

    // 4. 修改元素
    list2(3) = 30
    list2.update(0, 89)//指定位置修改元素
    println(list2)//ListBuffer(89, 96, 15, 30, 22, 62, 25, 11, 20, 12, 53, 75)

    // 5. 删除元素
    list2.remove(2)
    list2 -= 25// 删除指定值的元素
    println(list2)//ListBuffer(89, 96, 30, 22, 62, 11, 20, 12, 53, 75)
  }
}
