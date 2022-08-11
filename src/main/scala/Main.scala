package com.excome

object Main {
  def main(args: Array[String]) {
    val item1 = new Item(1, "Item 1", None)
    val item2 = new Item(2, "Item 2", Some(8))
    val item3 = new Item(3, "Item 3", Some(3))

    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(s"Item with kind = None: ${isItemKind(item1)}")
    println(s"Item with kind = 8: ${isItemKind(item2)}")
    println(s"Item with kind = 3: ${isItemKind(item3)}")
    println(s"Сумма нечетных чисел в коллекции: ${sumOddNumbers(numbers)}")
  }

  def isItemKind(item: Item): String = {
    if (item.kind.isDefined) {
      if (item.kind.get % 2 == 0) {
        return "чётное";
      } else {
        return item.description
      }
    } else {
      return "неизвестно"
    }
  }

  def sumOddNumbers(nums: Seq[Int]): Int = nums.filter(_ % 2 != 0).sum
}

class Item(var id: Int, var description: String, var kind: Option[Int])