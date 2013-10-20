Scala math algorithm
================

### description
Math algorithm written with Scala . I wrote this code to study Scala lang .

Samples
---

[Muenchhausen Number](http://mathworld.wolfram.com/MuenchhausenNumber.html "MuenchhausenNumber")

+ on sbt console

        scala> import com.rkaneko.algorithm.math.MuenchhausenNumber
        import com.rkaneko.algorithm.math.MuenchhausenNumber

        scala> val mnsOpt = MuenchhausenNumber.find(10000)
        mnOpt: Option[Array[Int]] = Some([I@6920e5f1)

        scala> mnsOpt match {
             |   case Some(mns) => mn mkString " "
             |   case None => "not found!"
             | }
        res0: String = 1 3435

