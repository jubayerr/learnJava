import java.util.HashMap;
import java.util.Map;

/**
 * Map
 */
public class Maps {

    public static void main(String[] args) {
        Map m = new HashMap();
        String str = "I am from Bangladesh. It is a beautiful country";

        for (char x : str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old + 1);
            } else {
                m.put(x, 1);
            }
        }
        System.out.println(m);
    }
}