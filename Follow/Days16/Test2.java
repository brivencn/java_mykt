package Follow.Days16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @Author 陈帅
 * @Date 2023/12/7 12:35
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        System.out.println(date1);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // "yyyy年MM月dd日 HH:mm:ss"
        System.out.println(simpleDateFormat1.format(date1));

        String strTime = "2023-12-07 13:37:59";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(strTime);
        System.out.println(date);
    }

}
