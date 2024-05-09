package Follow.Days17;

import java.util.Calendar;

/**
 * @Author 陈帅
 * @Date 2023/12/7 13:33
 * @QQ 976104170
 * @Description
 **/

public class CalendarTest {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance(); // 多态机制，从3个子类里实例化一个
        System.out.println(instance);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+ 1);
        System.out.println(instance.get(Calendar.DATE));
    }
}
