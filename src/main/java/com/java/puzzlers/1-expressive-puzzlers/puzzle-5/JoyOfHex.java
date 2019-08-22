/**
 * 16 进制加法
 */
public class JoyOfHex {
    public static void main(String[] args) {
        //结果： 4294967296
        System.out.println(0x100000000L);
        //结果：-889275714
        System.out.println(0xcafebabe);
        //结果：3405691582
        System.out.println(0xcafebabeL);
        //结果: cafebabe　错误
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabe));
        //结果: 1cafebabe 正确
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
