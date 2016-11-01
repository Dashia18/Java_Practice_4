package Person;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Person {

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String name;

}
