import static java.util.Arrays.toString;
/**
 * 优先从当前范围查找方法
 */
class ImportDuty {
    public static void main(String[] args) {
        printArgs(1, 2, 3, 4, 5);
    }

    static void printArgs(Object... args) {
        System.out.println(toString(args));
    }
}
