package org.splitt13s
package raytracer

import raytracer.tuples.{Point, Vector}

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.math.sqrt

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

  "Multiplying a vector by a scalar" should "return the correctly scaled vector" in {
    val v: Vector = Vector(1, -2 ,3)

    val newVector: Vector = Vector(3.5, -7, 10.5)
    val result: Vector = v * 3.5

    result shouldEqual newVector
  }

  "Multiplying a vector by a fractional scalar" should "divide the vector" in {
    val v: Vector = Vector(1, -2 ,3)

    val newVector: Vector = Vector(0.5, -1, 1.5)
    val result: Vector = v * 0.5

    result shouldEqual newVector
  }

  "Dividing a vector by a scalar" should "return the correctly scaled vector" in {
    val v: Vector = Vector(1, -2 ,3)

    val newVector: Vector = Vector(0.5, -1, 1.5)
    val result: Vector = v / 2

    result shouldEqual newVector
  }

  "Computing the magnitude of a vector" should "the distance represented by the vector" in {
    val v: Vector = Vector(1, 2, 3)

    val magnitude: Double = sqrt(14)
    val result = v.magnitude

    result shouldEqual magnitude
  }

  "Normalising a vector" should "return a vector with a length of 1" in {
    val v: Vector = Vector(4, 0, 0)

    val normalisedVector: Vector = Vector(1, 0, 0)
    val result: Vector = v.normalise

    result shouldEqual normalisedVector
  }

  it should "have a magnitude of 1" in {
    val v: Vector = Vector(1, 2, 3)

    val normalisedVectorMagnitude = 1
    val result = v.normalise.magnitude

    result shouldEqual normalisedVectorMagnitude
  }

  "The dot product of two vector" should "return the scalar value" in {
    val v1: Vector = Vector(1, 2, 3)
    val v2: Vector = Vector(2, 3, 4)

    val dotProduct: Double = 20
    val result: Double = v1.dot(v2)

    result shouldEqual dotProduct
  }

  "The cross product of two vectors" should "return the perpendicular vector" in {
    val v1: Vector = Vector(1, 2, 3)
    val v2: Vector = Vector(2, 3, 4)

    val crossV1V2: Vector = Vector(-1, 2, -1)
    val crossV2V1: Vector = Vector(1, -2, 1)

    val resultV1V2: Vector = v1.cross(v2)
    val resultV2V1: Vector = v2.cross(v1)

    resultV1V2 shouldEqual crossV1V2
    resultV2V1 shouldEqual crossV2V1
  }

}
