package xx060;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SimpleDotaFormatTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:SS");
        String s = sdf.format(d);
        System.out.println(s);

        String ss = "2012.03.06 14:54:15";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}
