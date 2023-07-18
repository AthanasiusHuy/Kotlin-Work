package Task1

class Cylinder(radius: Double, color: String, private var height: Double) : Circle(radius, color) {

    fun getHeight(): Double {
        return height
    }

    fun setHeight(height: Double) {
        this.height = height
    }

    fun getVolume(): Double {
        return getArea() * height
    }

    override fun toString(): String {
        return "Cylinder(radius=${getRadius()}, height=$height, volume=${getVolume()})"
    }
}