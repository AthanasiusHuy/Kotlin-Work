package Task1

import java.lang.Math.PI

open class Circle(private var radius :Double, private var color : String) {
    fun getRadius(): Double {
        return radius
    }

    fun setRadius(radius: Double) {
        this.radius = radius
    }

    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getArea(): Double {
        return PI * radius * radius
    }

    override fun toString(): String {
        return "Circle(radius=$radius, area=${getArea()})"
    }
}