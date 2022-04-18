package org.splitt13s
package raytracer.tuples

import scala.annotation.targetName
import scala.math.{pow, sqrt}

case class Vector(x: Double, y: Double, z: Double, w: Double = 0) extends Tuple {

  @targetName("addVector")
  def +(vector: Vector): Vector = {
    Vector(this.x + vector.x,
           this.y + vector.y,
           this.z + vector.z,
    )
  }

  @targetName("addPoint")
  def +(point: Point): Point = {
    Point(this.x + point.x,
          this.y + point.y,
          this.z + point.z,
    )
  }

  @targetName("subtractVector")
  def -(vector: Vector): Vector = {
    Vector(this.x - vector.x,
           this.y - vector.y,
           this.z - vector.z,
    )
  }

  @targetName("negate")
  def unary_- : Vector = {
    Vector(0.0 - this.x,
           0.0 - this.y,
           0.0 - this.z
    )
  }

  @targetName("multiply")
  def *(scalar: Double): Vector = {
    Vector(this.x * scalar,
           this.y * scalar,
           this.z * scalar
    )
  }

  @targetName("divide")
  def /(scalar: Double): Vector = {
    Vector(this.x / scalar,
           this.y / scalar,
           this.z / scalar
    )
  }

  def magnitude: Double = sqrt(pow(this.x, 2) + pow(this.y, 2) + pow(this.z, 2) + pow(this.w, 2))

  def normalise: Vector = {
    Vector(this.x / this.magnitude,
           this.y / this.magnitude,
           this.z / this.magnitude
    )
  }

  def dot(vector: Vector): Double = this.x * vector.x + this.y * vector.y + this.z * vector.z

  def cross(vector: Vector): Vector = {
    Vector(this.y * vector.z - this.z * vector.y,
           this.z * vector.x - this.x * vector.z,
           this.x * vector.y - this.y * vector.x
    )
  }


}
