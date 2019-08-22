import java.util.Random;

/**
 * 1. StringBuffer 构造器问题 char类型被转换为 int 数字
 * 2. nextInt 返回[0~2) 之间的整数
 * 3. case 没有break；
 *
 */
public class Rhymes {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1:
                word = new StringBuffer('P');
            case 2:
                word = new StringBuffer('G');
            default:
                word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
