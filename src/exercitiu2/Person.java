package exercitiu2;

public class Person {
    private final String name;
    private final int age;
    private final HairColor hairColor;

    public Person(String name, int age, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": name='" + name + '\'' +
                ", age=" + age +
                ", hairColor=" + hairColor +
                '}';
    }


}
