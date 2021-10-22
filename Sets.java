import java.util.HashSet;
import java.util.Set;

/**
 * Sets
 */
public class Sets {
    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(6);
        t.add(8);
        t.add(8);
        t.add(10);
        // remove something form set
        t.remove(9);
        // check size
        t.size();
        // check empty or not
        t.isEmpty();
        // clear set
        t.clear();
        // find something from set
        boolean x = t.contains(5);
        System.out.println(x);
        // print set
        System.out.println(t);
    }
}