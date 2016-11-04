package shape;

/**
 * Created by Daria Serebryakova on 04.11.2016.
 */
public class Rectangle extends Shape{
    public Rectangle() {
    }

    public Rectangle(double wigth, double length) {
        this.width = wigth;
        this.length = length;
    }

    public Rectangle(String collor, boolean filled, double wigth, double length) {
        super(collor, filled);
        this.width = wigth;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                ", width=" + width +
                ", length=" + length +
                "} ";
    }

    //data
    private double width = 1.0;
    private double length = 1.0;
}
