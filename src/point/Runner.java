package point;

/**
 * Created by Daria Serebryakova on 02.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Point point01 = new Point(3,4);
        System.out.println(point01);

        MovablePoint point02 = new MovablePoint(2,4,3,5);
        System.out.println(point02);
        System.out.println(point02.move());


        //upcast - savety transformation: from the particular to the general
        System.out.println("\n--upcast--");
        Point point03 = new MovablePoint(1,2,4,5);
        System.out.println(point03);

        //downcast: type-safe downcast,  from the general  to particular
        System.out.println("\n--downcast--");
        MovablePoint point04 = (MovablePoint)point03;
        System.out.println(point04);

        //instanceof - tell about object what class he belongs
        System.out.println("\n--instanceof--");
        if (point01 instanceof Point){
            System.out.println("point01 is Point");
        }
        if (point01 instanceof MovablePoint){
            System.out.println("point01 is MovablePoint");
        }
        if (point02 instanceof Point){
            System.out.println("point02 is Point");
        }
        if (point02 instanceof MovablePoint){
            System.out.println("point02 is MovablePoint");
        }
        if (point03 instanceof Point){
            System.out.println("point03 is Point");
        }
        if (point03 instanceof MovablePoint){
            System.out.println("point03 is MovablePoint");
        }
        if (point04 instanceof Point){
            System.out.println("point04 is Point");
        }
        if (point04 instanceof MovablePoint){
            System.out.println("point04 is MovablePoint");
        }

    }
}
