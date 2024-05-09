package Follow.Days17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 陈帅
 * @Date 2023/12/7 13:00
 * @QQ 976104170
 * @Description
 **/

public class DateUtils {
    public static final String FORMAT_1 = "yyyy-MM-dd HH:mm:ss";

    /*
    * 1.工具类设计，无参构造私有化，方法属性 静态化
    *
    * */
    private DateUtils() {

    }


    public static String getCurrentTime() {
        return dateToString(new Date(), FORMAT_1);
    }

    /**
     * @Author          陈帅
     * @Description     将Date类 转换成 字符串格式化日期
     * @Date            2023/12/7 13:03
     * @Param           [date, format]
     * @Return          java.lang.String
     **/
    public static String dateToString(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * @Author          陈帅
     * @Description     将字符串格式化日期 转换成 Date类
     * @Date            2023/12/7 13:08
     * @Param           [date, format]
     * @Return          java.util.Date
     **/
    public static Date stringToDate(String date, String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
    }
}
