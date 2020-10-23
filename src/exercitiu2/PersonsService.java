package exercitiu2;

import java.util.*;

public class PersonsService {
    private final List<Person> persons = new ArrayList<>();

    public PersonsService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);

        }
    }

    public List<String> getPersonsName() {
        List<String> result = new ArrayList<>();

        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> resultMap = new HashMap<>();

        for (Person person : persons) {
            resultMap.put(person.getName(), person.getAge());
        }
        return resultMap;
    }

    public List<Person> getOlderPerson(int age) {
        List<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public Map<HairColor, List<String>> mapHairColorToPersonsNames() {
        Map<HairColor, List<String>> resultMap = new HashMap<>();

        for (Person person : persons) {
            List<String> names = resultMap.get(person.getHairColor());

            if (names == null) {
                names = new ArrayList<>();
                resultMap.put(person.getHairColor(), names);
            }
            names.add(person.getName());
        }
        return resultMap;
    }

    public Map<Integer, List<Person>> mapAgeToPersons() {
        Map<Integer, List<Person>> resultMap = new HashMap<>();
        for (Person person : persons) {
            List<Person> personList = resultMap.get(person.getAge());

            if (personList == null) {
                personList = new ArrayList<>();
                resultMap.put(person.getAge(), personList);
            }
            personList.add(person);

        }
        return resultMap;
    }


}
