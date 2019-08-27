/**
 * JAVA 构造函数解析过程：
 * 1.获取所有可使用的方法或构造器。
 * 2.在第一阶段中获取方法或构造器中最精确的一个。
 */
public class Confusing {
    private Confusing(Object o) {
        System.out.println("Object");
    }

    private Confusing(double[] dArray) {
        System.out.println("double array");
    }

    public static void main(String[] args) {
        //输出double array
        new Confusing(null);
    }
}
