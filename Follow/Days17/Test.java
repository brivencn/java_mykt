package Follow.Days17;

import java.text.ParseException;
import java.util.Date;

/**
 * @Author 陈帅
 * @Date 2023/12/7 13:04
 * @QQ 976104170
 * @Description
 **/

public class Test {
    public static void main(String[] args) throws ParseException {
        System.out.println(DateUtils.dateToString(new Date(), DateUtils.FORMAT_1));
        System.out.println(DateUtils.stringToDate("2012-06-12 12:12:12", DateUtils.FORMAT_1));
        System.out.println(DateUtils.getCurrentTime());
    }
}
