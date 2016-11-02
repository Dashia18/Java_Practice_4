package point2D;

/**
 * Created by dbobkova on 02.11.2016.
 */
public class Point3D extends Point2D{
    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y,float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] coord = {getX(),getY(),getZ()};
        return coord;

    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString()+
                ", " + z +
                "} " ;
    }

    //data
    private float z =0.0f;
}
