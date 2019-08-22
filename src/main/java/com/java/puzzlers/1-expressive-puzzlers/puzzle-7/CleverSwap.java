public class CleverSwap {
    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        //异或(^）:两个数转为二进制，然后从高位开始比较，如果相同则为0，不相同则为1。
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}
