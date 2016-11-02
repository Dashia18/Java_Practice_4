package point2D;



/**
 * Created by Daria Serebryakova on 02.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1, 2);
        System.out.println(point1);

        Point3D point2 = new Point3D(3, 2, 4);
        System.out.println(point2);

        //upcast - savety transformation: from the particular to the general
        System.out.println("\n--upcast--");
        Point2D point3 = new Point3D(4,5,6);
        System.out.println(point3);

        //downcast: type-safe downcast,  from the general  to particular
        System.out.println("\n--downcast--");
        Point3D point4 = (Point3D)point3;
        System.out.println(point4);

        //instanceof - tell about object what class he belongs
        System.out.println("\n--instanceof--");
        if (point1 instanceof Point2D){
            System.out.println("point1 is Point2D");
        }
        if (point1 instanceof Point3D){
            System.out.println("point1 is Point3D");
        }
        if (point2 instanceof Point2D){
            System.out.println("point2 is Point2D");
        }
        if (point2 instanceof Point3D){
            System.out.println("point2 is Point3D");
        }
        if (point3 instanceof Point2D){
            System.out.println("point3 is Point2D");
        }
        if (point3 instanceof Point3D){
            System.out.println("point3 is Point3D");
        }
        if (point4 instanceof Point2D){
            System.out.println("point4 is Point2D");
        }
        if (point4 instanceof Point3D){
            System.out.println("point4 is Point3D");
        }
    }
}
