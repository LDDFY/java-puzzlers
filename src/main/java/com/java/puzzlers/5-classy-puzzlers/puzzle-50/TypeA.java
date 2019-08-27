/**
 * instanceof :
 * 1. 当对象为 null 时候 instanceof 为false。
 * 2. 当 instanceof 左右都为类时候，其中一个必须是另一个的子类型
 * 3.
 */
public class TypeA {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s instanceof String);
    }
}
