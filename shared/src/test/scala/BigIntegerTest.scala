package com.example

import org.scalacheck._
import java.math.BigInteger

object BigIntegerTest extends Properties("BigInteger") {

  property("hashCode") = {
    val g = Gen.choose(0L, Long.MaxValue / 4L)
    Prop.forAll(g, g){ (a, b) =>
      val c = BigInteger.valueOf(a).add(BigInteger.valueOf(b))
      val d = BigInteger.valueOf(c.longValue())
      val e = c.hashCode()
      val f = d.hashCode()
      val result = e == f
      if(!result) {
        println((c == d, a, b, c, d, e, f))
      }
      result
    }
  }

}
