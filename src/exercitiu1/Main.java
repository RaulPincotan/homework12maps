package exercitiu1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SchoolManagement schoolManagement = new SchoolManagement(List.of(new Student("Raul", 7),
                new Student("Adrian ", 5),
                new Student("Emil ", 7),
                new Student("Cristina", 9),
                new Student("Vlad ", 8),
                new Student("Alexandra", 8),
                new Student("Ovidiu", 4)
        ));

        System.out.println(schoolManagement.mapStudentToGrade());
        System.out.println(schoolManagement.getMaxGrade());
        System.out.println(schoolManagement.getWorstGrade());
    }
}
