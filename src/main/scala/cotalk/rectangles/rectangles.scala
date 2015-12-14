package cotalk.rectangles

class Rectangle(var _width: Double, var _height: Double) {

  def width: Double = _width
  def width_=(value: Double): Unit = { _width = value }

  def height: Double = _height
  def height_=(value: Double): Unit = { _height = value }

  override def toString = s"Rectangle($width x $height)"
}

object GeometryUtils {

  def sumArea(rectangles: Rectangle*): Double =
    rectangles.map(r => r.width * r.height).sum

  def scaleBy(rectangle: Rectangle, factor: Double): Unit = {
    val multiplier = Math.sqrt(factor)
    rectangle.width *= multiplier
    rectangle.height *= multiplier
  }
}

class Square(initialSide: Double)
  extends Rectangle(initialSide, initialSide) {

  override def width_=(value: Double): Unit = { side = value }

  override def height_=(value: Double): Unit = { side = value }

  def side: Double = width
  def side_=(value: Double): Unit = {
    super.width_=(value)
    super.height_=(value)
  }

  override def toString = s"Square($side)"
}
