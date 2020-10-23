package exercitiu3;

import java.util.*;

public class CompanyService {
    private final List<Employee> employees = new ArrayList<>();

    public CompanyService(Collection<Employee> employees) {

        if (employees != null) {
            this.employees.addAll(employees);
        }

    }


    public List<Employee> getEmployeesWithHigherSalary(double salary) {
        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<Employee>> mapCompanyToPerson(String companyName) {
        Map<String, List<Employee>> result = new HashMap<>();
        List<Employee> employeesInCompany = new ArrayList<>();
        for (Employee employee : employees) {

            if (employee.getCompany().equalsIgnoreCase(companyName)) {
                employeesInCompany.add(employee);
                result.put(employee.getCompany(), employeesInCompany);
            }


        }
        return result;
    }

    public double getSumOfSalaries() {
        double sum = 0;

        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }


    public String getBiggestSalary() {
        double biggest = highestSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() == biggest) {
                return employee.getCompany();
            }
        }
        return null;
    }

    private double highestSalary() {
        double biggest = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > biggest) {
                biggest = employee.getSalary();
            }
        }
        return biggest;
    }
}
