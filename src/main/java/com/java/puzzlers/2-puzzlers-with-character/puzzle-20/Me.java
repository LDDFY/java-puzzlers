import java.util.regex.Pattern;

/**
 * 正则起始部分必须添加 \\
 */
public class Me {
    public static void main(String[] args) {
        System.out.println(Me.class.getSimpleName() + ".class");
        System.out.println(
                Me.class.getName().replaceAll(".", "/") + ".class");

        System.out.println(
                Me.class.getName().replaceAll("\\.", "/") + ".class");

        System.out.println(
                Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
    }
}
