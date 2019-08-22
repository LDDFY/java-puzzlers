/**
 *如果在 += 左侧是字符串类型则右侧可以是任何类型表示字符型连接。
 *
 */
public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        Object x = "Buy ";
        String i = "Effective Java";
        x = x + i;  // Must be LEGAL
        x += i;     // Must be ILLEGAL
        System.out.println(x);
    }
}
