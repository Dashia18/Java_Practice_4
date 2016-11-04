package abstractshape;

/**
 * Created by Daria Serebryakova on 04.11.2016.
 */
public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }

    public Square(double side,String collor, boolean filled) {
        super(collor, filled, side, side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "} ";

    }
}
