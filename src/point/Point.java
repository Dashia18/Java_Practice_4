package point;

/**
 * Created by Daria Serebryakova on 02.11.2016.
 */
public class Point {
    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] coord = {x, y};
        return coord;
    }
    @Override
    public String toString() {
        return "Point" +
                "(" + x +
                ", " + y +
                ")";
    }
    //data
    private float x = 0.0f;
    private float y = 0.0f;
}
