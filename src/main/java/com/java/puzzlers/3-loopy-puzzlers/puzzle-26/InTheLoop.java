/**
 * Integer.MAX_VALUE+1=-Integer.MAX_VALUE
 * 使用：int，char，short，long时候都需要注意此类问题
 */
public class InTheLoop {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (long i = START; i <= END; i++)
            count++;
        System.out.println(count);


//        //死循环 Integer.MAX_VALUE+1=-Integer.MAX_VALUE
//        count = 0;
//        for (int i = START; i <= END; i++)
//            count++;
//        System.out.println(count);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Byte.MAX_VALUE + 1);
        System.out.println(Character.MAX_VALUE + 1);
        System.out.println(Short.MAX_VALUE + 1);
        System.out.println(Long.MAX_VALUE + 1);
    }
}
