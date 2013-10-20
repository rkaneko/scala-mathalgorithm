package com.rkaneko.algorithm.math

/**
 * MuenchhauseNumber algorithm .
 * see : http://mathworld.wolfram.com/MuenchhausenNumber.html
 */
object MuenchhausenNumber {

  /**
   * Find MuenchhausenNumber from range(1, upperLimit) .
   *
   * @param upperLimit upperLimit must be 1 and more .
   * @return Some(Array[Long]) contains Musenchhausen numbers if found Muenchhausen number, else None .
   */
  def find(upperLimit: Long): Option[Array[Long]] = {
    require(upperLimit >= 1)
    val fixedUpperLimit = if (upperLimit > 10000000000l) 9999999999l else upperLimit
    def isMuenchhausen(n: Long): Boolean = {
      val str = n.toString
      val len = str.length
      val numbers =
        for (i <- 0 until len) yield str.charAt(i).asDigit.toLong
      val maybeMuenchhausen: Long = numbers.map({ j: Long => Math.pow(j, j).toLong }).sum
      val ret = maybeMuenchhausen == n
      ret
    }
    val ret = (1l to fixedUpperLimit) filter { isMuenchhausen(_) }
    if (ret.isEmpty) None
    else Some(ret.toArray)
  }
}
