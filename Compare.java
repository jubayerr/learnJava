public class Compare {
    public static void main(String[] args) {
        int x = 6;
        int y = 8;
        int z = 10;

        String a = "hello";
        String b = "hello";

        boolean compare = x < y;
        boolean compare2 = x > y;
        boolean compare3 = x != y;
        boolean compare4 = x == z;
        boolean compare5 = x <= y && y <= z;
        boolean compare6 = z >= y || z >= x;
        boolean compare7 = a == b;

        System.out.println(compare);
        System.out.println(compare2);
        System.out.println(compare3);
        System.out.println(compare4);
        System.out.println(compare5);
        System.out.println(compare6);
        System.out.println(compare7);
    }
}
