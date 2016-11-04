package abstractshape;

import static java.lang.Math.*;

/**
 * Created by Daria Serebryakova on 04.11.2016.
 */
public class Circle extends Shape{
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String collor, boolean filled, double radius) {
        super(collor, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = this.radius * this.radius * PI;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * PI * this.radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + radius +
                "} ";
    }

    //data
    protected double radius = 1.0;
}
