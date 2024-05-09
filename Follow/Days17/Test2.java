package Follow.Days17;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Author 陈帅
 * @Date 2023/12/7 13:58
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Calendar instance = Calendar.getInstance();
        instance.set(year, 2 ,1);
        instance.add(Calendar.DATE, -1);
        System.out.println(instance.get(Calendar.DATE));
    }
}
