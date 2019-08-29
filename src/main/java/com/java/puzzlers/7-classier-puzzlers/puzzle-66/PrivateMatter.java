/**
 * 类变量子类可以复写父类
 */
class Base {
    public String className = "Base";
    public static String staticClassName = "Base";
}

class Derived extends Base {
    private String className = "Derived";
    private static String staticClassName = "Base";

}

public class PrivateMatter {
    public static void main(String[] args) {
        System.out.println(new Derived().className);
        System.out.println(new Derived().staticClassName);
        System.out.println(((Base) new Derived()).className);
        System.out.println(((Base) new Derived()).staticClassName);
    }
}
