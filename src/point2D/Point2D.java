package point2D;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Point2D {
    public Point2D() {
    }

    public Point2D(float x, float y) {
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
        float[] coofr = {x,y};
        return coofr;
    }

    @Override
    public String toString() {
        return "Point2D " +
                "(" + x +
                ", " + y +
                ")";
    }

    //data
    private float x = 0.0f;
    private float y = 0.0f;
}
