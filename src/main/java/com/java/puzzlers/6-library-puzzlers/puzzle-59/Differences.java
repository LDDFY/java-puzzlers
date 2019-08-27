import java.util.HashSet;
import java.util.Set;

/**
 * 以为0 开头的整数类型字面常量将被解释成八进制数值
 */
public class Differences {
    public static void main(String[] args) {
        //012=10
        int vals[] = {789, 678, 567, 456, 345, 234, 123, 012};
        Set<Integer> diffs = new HashSet<Integer>();
        for (int i = 0; i < vals.length; i++) {
            for (int j = i; j < vals.length; j++) {
                diffs.add(vals[i] - vals[j]);
            }
        }
        System.out.println(diffs);
    }
}
