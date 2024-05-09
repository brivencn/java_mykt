package Follow.Days16;

import java.util.Date;

/**
 * @Author 陈帅
 * @Date 2023/12/6 22:20
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();     // 获取运行时的格式化日期
        System.out.println(date);   //  Wed Dec 06 22:22:12 CST 2023
        Date date1 = new Date(1000);    // long类型参数（毫秒） 获取从标准基准时间到参数（毫秒）
        System.out.println(date1);  //  Thu Jan 01 08:00:01 CST 1970

        System.out.println("-----------------------------------");

        System.out.println(date.getTime());     // 1701872764828
        System.out.println(date1.getTime());    //  1000
        long time = 3*60*60*1000;
        date.setTime(time);
        System.out.println(date);       //  Thu Jan 01 11:00:00 CST 1970
        date1.setTime(time);
        System.out.println(date1);      // Thu Jan 01 11:00:00 CST 1970
    }
}
