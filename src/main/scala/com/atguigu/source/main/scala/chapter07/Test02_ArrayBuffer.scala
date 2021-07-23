package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()//默认长度是16
    val arr2 = ArrayBuffer(23, 57, 92)

    println(arr1)
    println(arr2)

    // 2. 访问元素
//    println(arr1(0))     // error 该数组没有元素
    println(arr2(1))
    arr2(1) = 39
    println(arr2(1))

    println("======================")
    // 3. 添加元素
    val newArr1 = arr1 :+ 15 //该方式针对不可变数组的新增元素，所以会新建数组
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1) // false

    val newArr2 = arr1 += 19 // 该方式针对可变数组，newArr2 也指向了arr1 引用的实例对象
    println("arr1:"+arr1) //这里返回arr1:ArrayBuffer(19)
    println(newArr2)
    println(arr1 == newArr2)// true
    newArr2 += 13 // 当新增元素13，arr1返回 arr1:ArrayBuffer(19, 13)，所以可变数组在元素操作时不推荐赋值新的引用
    println("arr1:"+arr1)

    77 +=: arr1
    println(arr1) //ArrayBuffer(77, 19, 13)
    println(newArr2) //ArrayBuffer(77, 19, 13)

    // 可变数组推荐使用方法新增元素
    arr1.append(36) //末尾追加36
    arr1.prepend(11, 76) // 开头追加11和76
    arr1.insert(1, 13, 59) // 在索引1的位置添加13和59
    println(arr1)//ArrayBuffer(11, 13, 59, 76, 77, 19, 13, 36)


    arr1.insertAll(2, newArr1)//添加数组
    arr1.prependAll(newArr2)

    println(arr1)//ArrayBuffer(11, 13, 15, 59, 76, 77, 19, 13, 36, 11, 13, 15, 59, 76, 77, 19, 13, 36)

    // 4. 删除元素
    arr1.remove(3)//删除在索引3位置的元素
    println(arr1)//ArrayBuffer(11, 13, 15, 76, 77, 19, 13, 36, 11, 13, 15, 59, 76, 77, 19, 13, 36)

    arr1.remove(0, 10)// 从位置0 开始删除10个元素
    println(arr1)//ArrayBuffer(15, 59, 76, 77, 19, 13, 36)

    arr1 -= 13 // 删除指定值的元素,不存在则什么都不做
    println(arr1)//ArrayBuffer(15, 59, 76, 77, 19, 36)

    // 5. 可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 56, 98)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(", "))
    println(arr)

    // 6. 不可变数组转换为可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)
  }
}
