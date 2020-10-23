package exercitiu3;

import exercitiu2.HairColor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompanyService companyService = new CompanyService(List.of(
                new Employee("Dorel", 30, HairColor.BROWN, "ProgramareTech", 3500),
                new Employee("Pincotan", 29, HairColor.BRUNETTE, "OradeaTech", 3000),
                new Employee("Hagi", 55, HairColor.BROWN, "FootballTech", 7000),
                new Employee("Radu", 56, HairColor.BROWN, "FootballTech", 5900),
                new Employee("John", 55, HairColor.BLONDE, "InovationTech", 2300),
                new Employee("Raul", 29, HairColor.BRUNETTE, "ProgramareTech", 3100)

        ));
        System.out.println(companyService.getEmployeesWithHigherSalary(3300));
        System.out.println();


        System.out.println();

        for (String companyName : companyService.mapCompanyToPerson("ProgramareTech").keySet()) {
            System.out.println(companyName + "->" + companyService.mapCompanyToPerson("ProgramareTech").get(companyName));
        }
        System.out.println();

        System.out.println("Sum of all salaries ->"+companyService.getSumOfSalaries());
        System.out.println();

        System.out.println("Company that offer biggest salary ->"+companyService.getBiggestSalary());


    }
}
