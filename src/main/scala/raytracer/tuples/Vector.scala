package org.splitt13s
package raytracer.tuples

import scala.annotation.targetName

case class Vector(x: Double, y: Double, z: Double, w: Double = 0) extends Tuple {

  @targetName("addVector")
  def +(vector: Vector): Vector = {
    Vector(this.x + vector.x,
           this.y + vector.y,
           this.z + vector.z,
           this.w + vector.w
    )
  }

  @targetName("addPoint")
  def +(point: Point): Point = {
    Point(this.x + point.x,
          this.y + point.y,
          this.z + point.z,
          this.w + point.w
    )
  }

  @targetName("subtractVector")
  def -(vector: Vector): Vector = {
    Vector(this.x - vector.x,
           this.y - vector.y,
           this.z - vector.z,
           this.w - vector.w
    )
  }

  @targetName("unary")
  def unary_- : Vector = {
    Vector(0.0 - this.x,
           0.0 - this.y,
           0.0 - this.z,
           this.w
    )
  }

}
