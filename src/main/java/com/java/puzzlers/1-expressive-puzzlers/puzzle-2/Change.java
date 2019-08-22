import java.math.BigDecimal;

/**
 * 在需要要求精度计算的地方，需要避免使用，double、float;对于货币计算需要使用int、long、BigDecimal.
 */
public class Change {
    public static void main(String args[]) {
        //TODO Double,Float等类型, 二进制浮点数，无法将0.1或者10的任何其他负次幂精确表示为一个长度优先的二进制小数。
        System.out.println(2.00 - 1.10);

        //TODO BigDecimal构造器建议使用字符串类型（BigDecimal(String)），而非BigDecimal(Double)

        //结果：0.1000000000000000055511151231257827021181583404541015625
        System.out.println(new BigDecimal(.1));
        //结果：0.1
        System.out.println(new BigDecimal(".1"));

        //结果：0.90
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
        //结果：0.899999999999999911182158029987476766109466552734375
        System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
    }
}
