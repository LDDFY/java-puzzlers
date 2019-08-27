import java.util.Calendar;

/**
 * 静态变量初始化顺序
 * 1. 静态变量初始化赋默认值
 * 2. 静态变量按照顺序初始化
 * 3. 类变量初始化
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private final int beltSize;
    private static final int CURRENT_YEAR =
            Calendar.getInstance().get(Calendar.YEAR);

    private Elvis() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears a size " +
                INSTANCE.beltSize() + " belt.");
    }
}
