import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        System.out.println("Input your age: ");
        Scanner yourAge = new Scanner(System.in);
        String y = yourAge.nextLine();
        int age = Integer.parseInt(y);

        if (age >= 16) {
            System.out.println("You have access to the carnival!");
        } else if (age >= 12) {
            System.out.println("Write your fav food: ");
            String food = yourAge.nextLine();
            if (food.equals("pizza")) {
                System.out.println("You get a pizza!");
            } else {
                System.out.println("You can try burger!");
            }
        } else {
            System.out.println("You are going to baby zone");
        }
    }
}
