package org.splitt13s
package raytracer

import raytracer.tuples.{Point, Vector}

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class VectorTest extends AnyFlatSpec with Matchers {

  "A new vector" should "have w set as 0" in {
    val v: Vector = Vector(4, -4, 3)
    v.w shouldBe 0
  }

  it should "contain the same values as a new vector with the same coordinates" in {
    val v1: Vector = Vector(4, -4, 3)
    val v2: Vector = Vector(4, -4, 3)
    v1.isEqualTo(v2) shouldBe true
  }

  "Adding a vector and a vector" should "return a new vector" in {
    val v1: Vector = Vector(3, -2, 5)
    val v2: Vector = Vector(-2, 3, 1)

    val newVector: Vector = Vector(1, 1, 6)
    val result: Vector = v1 + v2

    result shouldEqual newVector
  }

  "Adding a point and a vector" should "return a new point" in {
    val v: Vector = Vector(-2, 3, 1)
    val p: Point = Point(3, -2, 5)

    val newPoint: Point = Point(1, 1, 6)
    val result: Point = v + p

    result shouldEqual newPoint
  }

  "Subtracting a vector from a vector" should "return a new vector" in {
    val v1: Vector = Vector(3, 2, 1)
    val v2: Vector = Vector(5, 6, 7)

    val newVector: Vector = Vector(-2, -4, -6)
    val result: Vector = v1 - v2

    result shouldEqual newVector
  }

  "Subtracting a vector from the zero vector" should "return the opposite vector" in {
    val zero: Vector = Vector(0, 0, 0)
    val v: Vector = Vector(1, -2, 3)

    val newVector: Vector = Vector(-1, 2, -3)
    val result: Vector = zero - v

    result shouldEqual newVector
  }

  "Negating a vector" should "return the opposite vector" in {
    val v: Vector = Vector(1, -2, 3)

    val newVector : Vector = Vector(-1, 2, -3)
    val result: Vector = -v

    result shouldEqual newVector
  }

}
