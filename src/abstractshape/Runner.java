package abstractshape;

/**
 * Created by Daria Serebryakova on 04.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Shape object must not exist, class is abstract!");


        //upcast - savety transformation: from the particular to the general
        System.out.println("\n--upcast--");
        Shape shape1 = new Circle(5);
        System.out.println("shape1 = "+shape1);

        Shape shape2 = new Rectangle(3,4);
        System.out.println("shape2 = "+shape2);

        Shape shape3 = new Square(6);
        System.out.println("shape3 = "+shape3);

        Rectangle rectangle2 = new Square(7);
        System.out.println("rectangle2 = "+rectangle2);

        //downcast: type-safe downcast,  from the general  to particular
        System.out.println("\n--downcast--");
        Circle circle1 = (Circle)shape1;
        System.out.println("circle1 = "+circle1);

        Rectangle rectangle1 = (Rectangle)shape2;
        System.out.println("rectangle1 = "+rectangle1);

        Square square1 = (Square) shape3;
        System.out.println("square1 = "+square1);

        Square square2 = (Square) rectangle2;
        System.out.println("square2 = "+square2);

        //instanceof - tell about object what class he belongs
        System.out.println("\n--instanceof--");

        if(shape1 instanceof Shape){
            System.out.println("shape1 is Shape");
        }
        if(shape1 instanceof Circle){
            System.out.println("shape1 is Circle");
        }
        if(shape1 instanceof Rectangle){
            System.out.println("shape1 is Rectangle");
        }
        if(shape1 instanceof Square){
            System.out.println("shape1 is Square");
        }

        if(shape3 instanceof Shape){
            System.out.println("shape3 is Shape");
        }
        if(shape3 instanceof Circle){
            System.out.println("shape3 is Circle");
        }
        if(shape3 instanceof Rectangle){
            System.out.println("shape3 is Rectangle");
        }
        if(shape3 instanceof Square){
            System.out.println("shape3 is Square");
        }

        if(rectangle1 instanceof Shape){
            System.out.println("rectangle1 is Shape");
        }
        if(rectangle1 instanceof Rectangle){
            System.out.println("rectangle1 is Rectangle");
        }
        if(rectangle1 instanceof Square){
            System.out.println("rectangle1 is Square");
        }

        if(square2 instanceof Shape){
            System.out.println("square2 is Shape");
        }
        if(square2 instanceof Rectangle){
            System.out.println("square2 is Rectangle");
        }
        if(square2 instanceof Square){
            System.out.println("square2 is Square");
        }
    }
}
