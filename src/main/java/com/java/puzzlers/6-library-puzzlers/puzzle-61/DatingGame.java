import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期类月份从0开始，getDay是星期几
 */
public class DatingGame {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, 12, 31); // Year, Month, Day
        System.out.println(cal.get(Calendar.YEAR) + " ");

        Date d = cal.getTime();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d));
        System.out.println(d.getDay());
    }
}
