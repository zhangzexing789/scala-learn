package chapter07

object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,3,5,7,2,89)
    val list2 = List(3,7,2,45,4,8,19)

    //    （1）获取集合的头
    println(list1.head)

    //    （2）获取集合的尾（不是头的就是尾）
    println(list1.tail)

    //    （3）集合最后一个数据
    println(list2.last)

    //    （4）集合初始数据（不包含最后一个的其他所有元素）
    println(list2.init)

    //    （5）反转
    println(list1.reverse)

    //    （6）取前（后）n个元素
    println(list1.take(3))
    println(list1.takeRight(4))

    //    （7）去掉前（后）n个元素
    println(list1.drop(3))
    println(list1.dropRight(4))

    println("=========================")
    //    （8）并集
    val union = list1.union(list2)
    println("union: " + union)
    println(list1 ::: list2)

    // 如果是set做并集，会去重
    val set1 = Set(1,3,5,7,2,89)
    val set2 = Set(3,7,2,45,4,8,19)

    val union2 = set1.union(set2)
    println("union2: " + union2)//union2: Set(5, 89, 1, 2, 45, 7, 3, 8, 19, 4)
    println(set1 ++ set2)//Set(5, 89, 1, 2, 45, 7, 3, 8, 19, 4)

    println("-----------------------")
    //    （9）交集
    val intersection = list1.intersect(list2)
    println("intersection: " + intersection)//intersection: List(3, 7, 2)

    println("-----------------------")
    //    （10）差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println("diff1: " + diff1)
    println("diff2: " + diff2)

    println("-----------------------")
    //    （11）拉链: 两个集合相同位置的元素进行配对形成元组。
    //    如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    //    val list1 = List(1,3,5,7,2,89)
    //    val list2 = List(3,7,2,45,4,8,19)
    println("zip: " + list1.zip(list2))//zip: List((1,3), (3,7), (5,2), (7,45), (2,4), (89,8))
    println("zip: " + list2.zip(list1))//zip: List((3,1), (7,3), (2,5), (45,7), (4,2), (8,89))

    println("-----------------------")
    //    （12）滑窗: 按照给定长度滑动返回元素组
    for (elem <- list1.sliding(3))
      println(elem)
//    List(1, 3, 5)
//    List(3, 5, 7)
//    List(5, 7, 2)
//    List(7, 2, 89)
    println("-----------------------")
    // 默认滑动步长为1
    for (elem <- list2.sliding(4, 2))// 指定步长为2
      println(elem)
//    List(3, 7, 2, 45)
//    List(2, 45, 4, 8)
//    List(4, 8, 19)
    println("-----------------------")
    // 滚动窗口
    for (elem <- list2.sliding(3, 3))
      println(elem)
//    List(3, 7, 2)
//    List(45, 4, 8)
//    List(19)
  }
}
