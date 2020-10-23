package exercitiu2;

import exercitiu3.CompanyService;
import exercitiu3.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonsService personsService = new PersonsService(List.of(new Person("Raul", 29, HairColor.BRUNETTE),
                new Person("Cristina", 28, HairColor.BROWN),
                new Person("Emil", 38, HairColor.BROWN),
                new Person("Vlad", 31, HairColor.BLONDE),
                new Person("Bia", 28, HairColor.BLONDE),
                new Person("Maria", 42, HairColor.BLONDE),
                new Person("George", 42, HairColor.BRUNETTE),
                new Person("Denisa", 44, HairColor.BROWN)

        ));


        System.out.println(personsService.getPersonsName());
        System.out.println();
        System.out.println(personsService.mapNameToAge());
        System.out.println();
        System.out.println(personsService.getOlderPerson(40));
        System.out.println();
        for (HairColor hairColor : personsService.mapHairColorToPersonsNames().keySet()) {
            System.out.println(hairColor + "->" + personsService.mapHairColorToPersonsNames().get(hairColor));
        }
        System.out.println();
        for (Integer age : personsService.mapAgeToPersons().keySet()) {
            System.out.println(age + "->" + personsService.mapAgeToPersons().get(age));
        }
        System.out.println();

    }
}
