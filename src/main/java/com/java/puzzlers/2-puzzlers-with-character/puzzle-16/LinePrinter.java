public class LinePrinter {
    public static void main(String[] args) {
        // Note: \u000A is Unicode representation of linefeed (LF)
        // \u000A 为换行符，编译器解释时候会将当前注释换成两行导致编译失败
        char c = 0x000A;
        System.out.println(c);
    }
}
