import Person.*;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */

public class Runner {
    public static void main(String[] args) {
        Person pers1 = new Person("Ekaterina","N.Novgorod, Rodionova ave. 5");
        System.out.println(pers1);

        Student stud = new Student("Daria", "N.Novgorod, Minina ave. 1", "master", 2, 0.0);
        System.out.println(stud);

        Staff staff = new Staff("Maria", "N.Novgorod, Gagarina ave. 8", "245", 25000.0);
        System.out.println(staff);
    }
}
