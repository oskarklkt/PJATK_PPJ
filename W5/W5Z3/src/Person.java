// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this.name = name;
        this.birthYear = 1990;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2023 - birthYear;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return name.equals(other.name) && birthYear == other.birthYear;
    }


    public static void main(String[] args) {
        Person person1 = new Person("Oskar", 2001);
        System.out.println("Imię pierwszej osoby: " + person1.getName());
        System.out.println("Wiek pierwszej osoby: " + person1.getAge());
        Person person2 = new Person("Adam");
        System.out.println("Imię drugiej osoby: " + person2.getName());
        System.out.println("Wiek drugiej osoby: " + person2.getAge());
        Person person3 = new Person("Oskar", 2001);
        System.out.println("Imię trzeciej osoby: " + person3.getName());
        System.out.println("Wiek trzeciej osoby: " + person3.getAge());
        if (person1.equals(person2)) {
            System.out.println("obiekty person1 i person2 mają taką samą zawartość ");
        } else {
            System.out.println("obiekty person1 i person2 mają inną zawartość ");
        }
        if (person1.equals(person3)) {
            System.out.println("obiekty person1 i person3 mają taką samą zawartość ");
        } else {
            System.out.println("obiekty person1 i person3 mają inną zawartość ");
        }

    }
}