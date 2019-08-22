/**
 * 多重转型：
 * 如果最初的数值类型是有符号的，那么就执行符号扩展，如果是char，则不管他将要转换成什么类型都执行0扩展。
 */
public class Multicast {
    public static void main(String[] args) {

        // byte：-128~127
        // char：0~65535
        // 结果：65535
        System.out.println((int) (char) (byte) -1);

        //16 bit
        long sum = 0;
        for (int i = 0; i <= 15; i++) {
            sum += Math.pow(2.0, i);
        }
        System.out.println(sum);
    }
}
