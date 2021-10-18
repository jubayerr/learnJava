/**
 * math
 */
public class math {

    public static void main(String[] args) {

        int x = 6;
        int y = 8;
        int z = 24;

        int sum = x + y + z;
        int sum2 = (x * y * z) / (z - x);

        double u = 5;
        double v = 14;
        double w = 44;

        double d = Math.pow(x, y);

        double res = (u * v * w) / w;

        System.out.println(sum);
        System.out.println(sum2);

        System.out.println("float number");
        System.out.println(res);
        System.out.println(d);
    }
}