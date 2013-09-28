Scala math algorithm
================

### description
Math algorithm written with Scala . I wrote this code to study Scala lang .

Samples
---

[Muenchausen Number](http://mathworld.wolfram.com/MuenchhausenNumber.html "MuenchhausenNumber")

+ on REPL

        scala> import com.rkaneko.algorithm.math.MuenchhausenNumber
        import com.rkaneko.algorithm.math.MuenchhausenNumber
       
        scala> val mnOpt = MuenchhausenNumber.find(10000)
        mnOpt: Option[Array[Int]] = Some([I@6920e5f1)

        scala> mnOpt match {
             |   case Some(mn) => mn mkString " "
             |   case None => "not found!"
             | }
        res0: String = 1 3435

