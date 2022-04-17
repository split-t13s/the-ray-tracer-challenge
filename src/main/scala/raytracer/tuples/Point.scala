package org.splitt13s
package raytracer.tuples

import scala.annotation.targetName

case class Point(x: Double, y: Double, z: Double, w: Double = 1) extends Tuple {
  
  @targetName("addVector")
  def +(vector: Vector): Point = {
    Point(this.x + vector.x,
          this.y + vector.y,
          this.z + vector.z,
          this.w + vector.w
    )
  }

  @targetName("subtractPoint")
  def -(point: Point): Vector = {
    Vector(this.x - point.x,
           this.y - point.y,
           this.z - point.z,
           this.w - point.w
    )
  }
  
  @targetName("subtractVector")
  def -(vector: Vector): Point = {
    Point(this.x - vector.x,
          this.y - vector.y,
          this.z - vector.z,
          this.w - vector.w
    )
  }
  
  @targetName("unary")
  def unary_- : Point = {
    Point(0.0 - this.x,
          0.0 - this.y,
          0.0 - this.z,
          this.w
    )
  }

}