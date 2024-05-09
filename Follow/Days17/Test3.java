package Follow.Days17;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 陈帅
 * @Date 2023/12/7 14:47
 * @QQ 976104170
 * @Description
 **/

public class Test3 {
    public static void main(String[] args) {

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parse = simpleDateFormat.parse("2025-12-21");
            System.out.println(parse);
        } catch (Exception e) {
//            ArrayIndexOutOfBoundsException
        }
    }
}
