/**
 * JAVA 对静态方法的调用不存在动态分派机制；
 * 当一个程序调用一个静态方法时，在编译时刻被选定。
 * 修饰符的编译期类型即为我们给出的方法调用表达式中原点左边的类型．
 */

class Dog1 {
    public static void bark() {
        System.out.print("woof ");
    }
}

class Basenji extends Dog1 {
    public static void bark() {
    }
}

public class Bark {
    public static void main(String args[]) {
        Dog1 woofer = new Dog1();
        Dog1 nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}
