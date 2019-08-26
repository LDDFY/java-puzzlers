/**
 * 一个浮点数值越大，它和其后继数值之间的间隔就越大，
 * 浮点数的这种分布是用固定数量的有效位来标识他们的必然结果，
 * 对一个足够大的浮点数加一，不会改变他的值。
 */
public class Looper {
    public static void main(String[] args) {
        System.out.println(Math.ulp(1.0e40));
        // Place your declaration for i here

        //  double i=1.0e40;
        double i = Double.POSITIVE_INFINITY;
        while (i == i + 1) {
        }
    }
}
