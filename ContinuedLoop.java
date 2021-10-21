import java.util.Scanner;

/**
 * Continued For Loop
 */
public class ContinuedLoop {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 5, 10 };
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int element : arr) {
            System.out.println(element);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n : names) {
            System.out.println(n);
            if (n.equals("jonas")) {
                break;
            }
        }
    }
}