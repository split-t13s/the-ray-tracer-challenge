package org.splitt13s
package raytracer.tuples

import scala.annotation.targetName

case class Point(x: Double, y: Double, z: Double, w: Double = 1) extends Tuple {
  
  @targetName("addVector")
  def +(vector: Vector): Point = {
    Point(this.x + vector.x,
          this.y + vector.y,
          this.z + vector.z,
    )
  }

  @targetName("subtractPoint")
  def -(point: Point): Vector = {
    Vector(this.x - point.x,
           this.y - point.y,
           this.z - point.z,
    )
  }
  
  @targetName("subtractVector")
  def -(vector: Vector): Point = {
    Point(this.x - vector.x,
          this.y - vector.y,
          this.z - vector.z,
    )
  }
  
  @targetName("negate")
  def unary_- : Point = {
    Point(0.0 - this.x,
          0.0 - this.y,
          0.0 - this.z,
    )
  }
  
  @targetName("multiply")
  def *(scalar: Double): Point = {
    Point(this.x * scalar,
          this.y * scalar,
          this.z * scalar      
    )
  }
  
  @targetName("divide")
  def /(scalar: Double): Point = {
    Point(this.x / scalar,
          this.y / scalar,
          this.z / scalar
    )
  }

}