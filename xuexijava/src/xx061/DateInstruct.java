package xx061;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInstruct {
    private DateInstruct(){}   //构造方法私有
    public static String DateToSrting(Date d1, String s){   //成员方法静态
       SimpleDateFormat sdf = new SimpleDateFormat(s);
        String s1 = sdf.format(d1);//sdf.format(d1) ctrl+alt+V 生成左边String format,再给format改个名字
        return s1;
    }

    public static Date StringToDate(String s, String d1) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date ddddd = sdf.parse(s);
        return ddddd;
    }

}
