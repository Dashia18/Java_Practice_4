package Person;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
//        Person pers1 = new Person("Ekaterina","N.Novgorod, Rodionova ave. 5");
//        System.out.println(pers1);
//
//        Student stud1 = new Student("Daria", "N.Novgorod, Minina ave. 1", "master", 2, 0.0);
//        System.out.println(stud1);
//
//        Staff staff1 = new Staff("Maria", "N.Novgorod, Gagarina ave. 8", "245", 25000.0);
//        System.out.println(staff1);



        //upcast - savety transformation: from the particular to the general
        System.out.println("--upcast--");
        Person pers2 = new Student("Daria", "N.Novgorod, Minina ave. 1", "master", 2, 0.0);
        System.out.println(pers2);

        Person pers3 = new Staff("Maria", "N.Novgorod, Gagarina ave. 34", "22", 0.0);
        System.out.println(pers3);

        //downcast: type-safe downcast,  from the generalthe to particular
        System.out.println("--downcast--");
        Student stud2 = (Student)pers2;
        System.out.println(stud2);

        Staff staff2 = (Staff) pers3;
        System.out.println(staff2);

        //instanceof - tell about object what class he belongs
        System.out.println("--instanceof--");
        if (pers2 instanceof Person){
            System.out.println("per2 is Person");
        }
        if(pers2 instanceof Student){
            System.out.println("per2 is Student");
        }
        if(pers2 instanceof Staff){
            System.out.println("per2 is Staff");
        }


        if (pers3 instanceof Person){
            System.out.println("per3 is Person");
        }
        if(pers3 instanceof Student){
            System.out.println("per3 is Student");
        }
        if(pers3 instanceof Staff){
            System.out.println("per3 is Staff");
        }



    }
}
