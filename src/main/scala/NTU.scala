package com.rkaneko.algorithm.math

/**
 * The number turning upon ( which means 'hirakinaori su in Japanese ) .
 */
object NTU {
  
  /**
   * Find ntu from range(1, upperLimit) .
   *
   * @param upperLimit upperLimit must be 1 and more .
   */
  def find(upperLimit: Int): Option[Array[Int]] = {
    require(upperLimit >= 1)
    def isNtu(n: Int): Boolean = {
      val str = n.toString
      val len = str.length
      val numbers =
        for (i <- 0 until len) yield str.charAt(i).asDigit
      val maybeNtu: Int = numbers.map({ j:Int => Math.pow(j, j).toInt }).sum
      val ret = maybeNtu == n
      ret
    }
    val ret = (1 to upperLimit) filter { isNtu(_) }
    if (ret.isEmpty) None
    else Some(ret.toArray)
  }
}
