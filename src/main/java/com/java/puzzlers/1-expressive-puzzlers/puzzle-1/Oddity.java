
/**
 * 奇数定义：<br/>
 * 奇数（odd）指不能被2整除的数 ，数学表达形式为：2k+1， 奇数可以分为正奇数和负奇数。
 * Java 对取余（%）操作符定义：<br/>
 * 对所有 int 数值 a 和所有的非零 int 数值 b，都满足以下恒等式： (a / b) * b + (a % b) = a
 */
public class Oddity {

    public static boolean isOdd(int i) {
        //判断奇数错误用法
        //  return i % 2 == 1;
        //判断奇数正确用法
        //return i % 2 != 0;
        //判断奇数正确用法优化版本
        return (i & 1) != 0;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(-3));
    }
}
