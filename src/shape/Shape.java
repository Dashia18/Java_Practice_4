package shape;

/**
 * Created by Daria Serebryakova on 04.11.2016.
 */
public class Shape {
    public Shape() {
    }

    public Shape(String collor, boolean filled) {
        this.collor = collor;
        this.filled = filled;
    }

    public String getCollor() {
        return collor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "collor='" + collor + '\'' +
                ", filled=" + filled +
                '}';
    }

    //data
    private String collor = "red";
    private boolean filled = true;



}
