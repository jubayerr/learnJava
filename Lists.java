import java.util.ArrayList;

/**
 * Lists
 */
public class Lists {

    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);
        t.get(0);
        t.set(2, 4);
        t.subList(2, 5);

        System.out.println(t);
    }
}
