/**
 * Java基于2的补码的二进制算数运算，因此在-1在任何有符号的整数类型中（byte，short，int，long）标识都是所有的位被置位。
 */
public class Shifty {
    public static void main(String[] args) {
        int i = 0;
        while (-1 << i != 0) {
            System.out.println(-1 << i);
            i++;
        }
        System.out.println(i);
    }
}
