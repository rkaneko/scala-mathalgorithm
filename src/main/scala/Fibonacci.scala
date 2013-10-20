package com.rkaneko.algorithm.math

object Fibonacci {

  import scala.math.BigInt

  def get(columnNum: Int): Stream[BigInt] = {
    def fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
    fibs take(columnNum)
  }
}
