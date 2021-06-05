package xx061;

import java.text.ParseException;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) throws ParseException {
        Date ddd1 = new Date(); //创建日期对象  为系统现在时间
        final String sss = DateInstruct.DateToSrting(ddd1, "yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(sss);

        String sss1 = "2008-08-08 20-00-00";

        Date ddddddddd = DateInstruct.StringToDate(sss1, "yyyy-MM-dd HH-mm-ss");
        System.out.println(ddddddddd);


    }
}
