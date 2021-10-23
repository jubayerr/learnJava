// Inheritance
public class Pet extends Person {

    private int food;

    public Pet(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public void speak() {
        System.out.println("Meow name is " + this.name + " and its get feed " + this.food + " times in a day.");
    }

}
