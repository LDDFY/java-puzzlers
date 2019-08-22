public class EscapeRout {
    public static void main(String[] args) {
        // \u0022 是双引号的转移字符 (")
        // 等价于："a".length()+"b".length();
        System.out.println("a\u0022.length() + \u0022b".length());

        System.out.println("a\".length() + \"b".length());

    }
}
