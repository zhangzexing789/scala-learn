package chapter07

object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5,1,8,2,-3,4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))

    //    （1）求和
    var sum = 0
    for (elem <- list){
      sum += elem
    }
    println(sum)
    // 直接求和
    println(list.sum)

    //    （2）求乘积
    println(list.product)

    //    （3）最大值
    println(list.max)
    println(list2.maxBy( (tuple: (String, Int)) => tuple._2 ))//对复杂集合指定比较的值，默认比较第一个值。
    println(list2.maxBy( _._2 ))

    //    （4）最小值
    println(list.min)
    println(list2.minBy(_._2))//(e,-3)

    println("========================")

    //    （5）排序
    // 5.1 sorted
    val sortedList = list.sorted// 默认从小到大排序
    println(sortedList)

    // 从大到小逆序排序
    println(list.sorted.reverse)
    // 传入隐式参数，修改排序规则实现逆序
    println(list.sorted(Ordering[Int].reverse))

    println(list2.sorted)//默认以第一个值排序

    // 5.2 sortBy
    // 复杂集合指定排序的值
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    // 5.3 sortWith
    // 指定排序的规则，相当于java 的compare
    println(list.sortWith( (a: Int, b: Int) => {a < b} ))//List(-3, 1, 2, 4, 5, 8)
    println(list.sortWith( _ < _ ))//List(-3, 1, 2, 4, 5, 8)
    println(list.sortWith( _ > _))//List(8, 5, 4, 2, 1, -3)
  }
}
