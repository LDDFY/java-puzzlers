import java.io.UnsupportedEncodingException;

/**
 * 当byte 转换为String 时必须显示指定字符集，依赖缺省字符集可能导致字符集不一致问题。
 */
public class StringCheese {
    public static void main(String args[]) throws UnsupportedEncodingException {
        //ISO-8859-1 是唯一能够顺序打印出0-255的整数缺省字符集

        byte bytes[] = new byte[256];
        for (int i = 0; i < 256; i++)
            bytes[i] = (byte) i;

        String str = new String(bytes);
        for (int i = 0, n = str.length(); i < n; i++)
            System.out.print((int) str.charAt(i) + " ");

        System.out.println();

        str = new String(bytes, "ISO-8859-1");
        for (int i = 0, n = str.length(); i < n; i++)
            System.out.print((int) str.charAt(i) + " ");


        System.out.println();

        str = new String(bytes, "UTF-8");
        for (int i = 0, n = str.length(); i < n; i++)
            System.out.print((int) str.charAt(i) + " ");
    }
}
