// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Task6_02 {
    public static void main(String[] args) {
        Person person = new Person("Adam Nowak");
        person.show();
        System.out.println("-----------------------");
        Welder welder = new Welder("Michal Kowalski", 10);
        welder.show();
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Name: " + name);
    }
}

class Welder extends Person {
    private int lengthOfService;

    public Welder(String name, int lengthOfService) {
        super(name);
        this.lengthOfService = lengthOfService;
    }

    public void show() {
        super.show();
        System.out.println("Years of service: " + lengthOfService);
    }
}
