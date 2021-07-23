package chapter07

import scala.collection.mutable

object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)//Map(b -> 25, a -> 13, hello -> 3)
    println(map1.getClass)//class scala.collection.mutable.HashMap
    println("==========================")

    // 2. 添加元素
    map1.put("c", 5)
    map1.put("d", 9)
    println(map1)//Map(b -> 25, d -> 9, a -> 13, c -> 5, hello -> 3)

    map1 += (("e", 7))//注意两个括号
    println(map1)//Map(e -> 7, b -> 25, d -> 9, a -> 13, c -> 5, hello -> 3)
    println("====================")

    // 3. 删除元素
    println(map1("c"))
    map1.remove("c")//0
    println(map1.getOrElse("c", 0))

    map1 -= "d"
    println(map1)//Map(e -> 7, b -> 25, a -> 13, hello -> 3)

    println("====================")

    // 4. 修改元素
    map1.update("c", 5)
    map1.update("e", 10)
    println(map1)//Map(e -> 10, b -> 25, a -> 13, c -> 5, hello -> 3)

    println("====================")

    // 5. 合并两个Map, 存在key 即修改对应value
    val map2: Map[String, Int] = Map("aaa" -> 11, "b" -> 29, "hello" -> 5)
//    map1 ++= map2
    println(map1)//Map(e -> 10, b -> 25, a -> 13, c -> 5, hello -> 3)
    println(map2)//Map(aaa -> 11, b -> 29, hello -> 5)

    println("---------------------------")
    val map3: Map[String, Int] = map2 ++ map1
    println(map1)
    println(map2)
    println(map3)//Map(e -> 10, a -> 13, b -> 25, c -> 5, hello -> 3, aaa -> 11)
  }
}
