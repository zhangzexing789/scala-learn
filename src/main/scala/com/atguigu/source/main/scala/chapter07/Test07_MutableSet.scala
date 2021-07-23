package chapter07

import scala.collection.mutable

object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建set
    val set1: mutable.Set[Int] = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)//Set(12, 78, 13, 53, 23)
    println("==================")

    // 2. 添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)//Set(12, 78, 13, 53, 11, 23)

    set1 += 11
    println(set1)//Set(12, 78, 13, 53, 11, 23)

    val flag1 = set1.add(10) // 返回是否添加成功
    println(flag1)//true
    println(set1)//Set(12, 78, 13, 53, 10, 11, 23)
    val flag2 = set1.add(10)
    println(flag2)// false
    println(set1)
    println("==================")

    // 3. 删除元素
    set1 -= 11
    println(set1)//Set(12, 78, 13, 53, 10, 23)

    val flag3 = set1.remove(10)// 返回是否删除成功
    println(flag3)//true
    println(set1)//Set(12, 78, 13, 53, 23)
    val flag4 = set1.remove(10)
    println(flag4)//false
    println(set1)
    println("==================")

    // 4. 合并两个Set
    val set3 = mutable.Set(12,23,34)
    val set4 = set2 ++ set3
    println(set2)//Set(12, 78, 13, 53, 11, 23)
    println(set3)//Set(12, 34, 23)
    println(set4)//Set(12, 78, 34, 13, 53, 11, 23)

    set2 ++= set3
    println(set2)//Set(12, 78, 34, 13, 53, 11, 23)
    println(set3)
  }
}
