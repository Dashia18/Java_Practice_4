package point;

/**
 * Created by Daria Serebryakova on 02.11.2016.
 */
public class MovablePoint extends Point {
    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString() +
                " Speed = (" + xSpeed +
                ", " + ySpeed +
                ")} " ;
    }
    public MovablePoint move(){
        float x = getX();
        float y = getY();
        x = x + xSpeed;
        y = y + ySpeed;
        setX(x);
        setY(y);
        return this;
    }
    //data
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
}
