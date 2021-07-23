package chapter07

object Test04_List {
  def main(args: Array[String]): Unit = {
    // List 默认为不可变集合
    // 1 . 创建一个List
    val list1 = List(23, 65, 87)
    println(list1)//List(23, 65, 87)

    // 2. 访问和遍历元素
    println(list1(1))
//    list1(1) = 12 // 无法更新元素
    list1.foreach(println)

    // 3. 添加元素
    val list2 = 10 +: list1 //
    val list3 = list1 :+ 23
    println(list1)
    println(list2) //List(10, 23, 65, 87)
    println(list3) //List(23, 65, 87, 23)

    println("==================")

    val list4 = list2.::(51) //
    println(list4) //List(51, 10, 23, 65, 87)

    val list5 = Nil.::(13) // 空列表开头添加13
    println(list5)//List(13)

    val list6 = 73 :: 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println(list7) // List(17, 28, 59, 16)

    // 4. 合并列表
    val list8 = list6 :: list7 //在列表list7开头添加list6
    println(list8)//List(List(73, 32), 17, 28, 59, 16)

    val list9 = list6 ::: list7
    println(list9)//List(73, 32, 17, 28, 59, 16)

    val list10 = list6 ++ list7
    println(list10)//List(73, 32, 17, 28, 59, 16)

  }
}
