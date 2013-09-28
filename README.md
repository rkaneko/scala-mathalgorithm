Scala math algorithm
================

### description
Math algorithm written with Scala . I wrote this code to study Scala lang .

Samples
---

### NTU - hirakinaori su in Japanese

+ on REPL

        scala> import com.rkaneko.algorithm.math.NTU
        import com.rkaneko.algorithm.math.NTU

        scala> val a = NTU.find(10000000)
        a: Option[Array[Int]] = Some([I@6939944f)

        scala> a match {
         |   case Some(array) => array mkString " "
         |   case None => "not found!"
         | }
        res2: String = 1 3435


