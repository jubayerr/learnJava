// Class
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " old.");
    }
}
