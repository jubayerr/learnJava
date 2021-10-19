import java.util.Scanner;

/**
 * Conditional
 */
public class Conditional {

    public static void main(String[] args) {
        Scanner sName = new Scanner(System.in);

        String s = sName.nextLine();

        if (s.equals("jubayer")) {
            System.out.println("Hello, Jubayer");
        } else if (s.equals("hi")) {
            System.out.println("How are you?");
        } else {
            System.out.println("ok");
        }
    }
}