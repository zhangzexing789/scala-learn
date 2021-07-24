package com.zexing.day01

object TestCommonWorldCount {
  def main(args: Array[String]): Unit = {
    val StringLists: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )

//    val stringses: List[Array[String]] = StringLists.map(_.split(" "))
//    val wordlist: List[String] = stringses.flatten


//    val wordlist: List[String] = StringLists.flatMap(_.split(" "))
//    println(wordlist)
//
//    val groupMap: Map[String, List[String]] = wordlist.groupBy(word => word)
//    println(groupMap)
//
//    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
//
//    val sortList: List[(String, Int)] = countMap.toList
//      .sortWith(_._2>_._2)
//      .take(3)
//    println(sortList)

    StringLists.flatMap(_.split(" ")).groupBy(word => word).map(kv=>(kv._1,kv._2.length)).toList.sortWith(_._2>_._2).take(3)

  }

}
