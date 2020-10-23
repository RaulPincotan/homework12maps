package exercitiu3;

import exercitiu2.HairColor;
import exercitiu2.Person;

public class Employee extends Person {
    private final String company;
    private final double salary;

    public Employee(String name, int age, HairColor hairColor, String company, double salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "  company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
