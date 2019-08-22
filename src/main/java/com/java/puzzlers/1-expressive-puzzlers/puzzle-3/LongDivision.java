public class LongDivision {
    public static void main(String[] args) {
        //微秒：24小时/天*60 分钟/小时* 60秒/分钟*1000毫秒/秒*1000毫秒/微秒
        //运算以　int　类型执行，执行完成后提升为 long 类型导致溢出，
        //final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        //final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        //指定以 long 类型进行运算,当两个 int 类型的数字相乘时，将得到一个 int 类型的结果，存储运算结果的类型会影响计算所使用的类型
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

        //结果：5
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        //结果：9223372036854775807
        System.out.println(Long.MAX_VALUE);
        //结果：500654080
        System.out.println(MICROS_PER_DAY);
        //结果：86400000
        System.out.println(MILLIS_PER_DAY);
    }
}
