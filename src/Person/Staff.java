package Person;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Staff extends Person {
    public Staff() {

    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                " school='" + school + '\'' +
                ", pay=" + pay +
                "} " ;
    }

    //data
    private String school;
    private double pay;
}
