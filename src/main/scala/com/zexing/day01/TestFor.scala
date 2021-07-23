package com.zexing.day01

object TestFor {
  def main(args: Array[String]): Unit = {
/*
    for (i <- 1 until 5 by 2; j =i-1)
      println(s"i:${i},j:${j}")
  }
  */
    val j = for (i <- 1  to 5) yield {
      i*2
    }
    print(j)
  }
}
