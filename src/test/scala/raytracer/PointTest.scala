package org.splitt13s
package raytracer

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import raytracer.tuples.{Point, Vector}

class PointTest extends AnyFlatSpec with Matchers {

  "A new point" should "have w set as 1" in {
    val p: Point = Point(4, -4, 3)
    p.w shouldBe 1
  }

  it should "contain the same values as a new point with the same coordinates" in {
    val p1: Point = Point(4, -4, 3)
    val p2: Point = Point(4, -4, 3)
    p1.isEqualTo(p2) shouldBe true
  }

  "Adding a point and a vector" should "return a new point" in {
    val p: Point = Point(3, -2, 5)
    val v: Vector = Vector(-2, 3, 1)

    val newPoint: Point = Point(1, 1, 6)
    val result: Point = p + v

    result shouldEqual newPoint
  }

  "Subtracting a point from a point" should "return a new vector" in {
    val p1: Point = Point(3, 2, 1)
    val p2: Point = Point(5, 6, 7)

    val newVector: Vector = Vector(-2, -4, -6)
    val result: Vector = p1 - p2

    result shouldEqual newVector
  }
  
  "Subtracting a vector from a point" should "return a new point" in {
    val p: Point = Point(3, 2, 1)
    val v: Vector = Vector(5, 6, 7)
    
    val newPoint: Point = Point(-2, -4, -6)
    val result: Point = p - v
    
    result shouldEqual newPoint
  }
  
  "Negating a point" should "return the opposite point" in {
    val p: Point = Point(1, -2, 3)
    
    val newPoint: Point = Point(-1, 2, -3)
    val result: Point = -p
    
    result shouldEqual newPoint
  }

  "Multiplying a point by a scalar" should "return the correctly scaled point" in {
    val p: Point = Point(1, -2 ,3)

    val newPoint: Point = Point(3.5, -7, 10.5)
    val result: Point = p * 3.5

    result shouldEqual newPoint
  }

  "Multiplying a point by a fractional scalar" should "divide the point" in {
    val p: Point = Point(1, -2 ,3)

    val newPoint: Point = Point(0.5, -1, 1.5)
    val result: Point = p * 0.5

    result shouldEqual newPoint
  }

  "Dividing a point by a scalar" should "return the correctly scaled point" in {
    val p: Point = Point(1, -2 ,3)

    val newPoint: Point = Point(0.5, -1, 1.5)
    val result: Point = p / 2

    result shouldEqual newPoint
  }

}
