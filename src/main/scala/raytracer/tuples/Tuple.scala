package org.splitt13s
package raytracer.tuples

import scala.annotation.targetName
import scala.math.abs

trait Tuple() {

  val x: Double
  val y: Double
  val z: Double
  val w: Double

  val EPSILON: Double = 0.0001

  def compareDoubles(a: Double, b: Double): Boolean = if abs(a - b) < EPSILON then true else false

  def isEqualTo(tuple: Tuple): Boolean = tuple match {
    case tuple: Tuple =>
      compareDoubles(this.x, tuple.x) &&
      compareDoubles(this.y, tuple.y) &&
      compareDoubles(this.z, tuple.z) &&
      compareDoubles(this.w, tuple.w)
  }

}

