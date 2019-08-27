import java.util.IdentityHashMap;
import java.util.Map;

/**
 * String 常量池
 */
public class NameGame {
    public static void main(String args[]) {
        Map<String, String> m = new IdentityHashMap<String, String>();
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
        System.out.println(m.size());


        Map<String, String> n = new IdentityHashMap<String, String>();
        n.put(new String("Mickey"), "Mouse");
        n.put(new String("Mickey"), "Mantle");
        System.out.println(n.size());
    }
}
