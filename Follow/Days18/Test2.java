package Follow.Days18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 陈帅
 * @Date 2023/12/8 15:56
 * @QQ 976104170
 * @Description 通过Scannaer生成ArrayList<>单列数组
 **/

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Teacher> arrList = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入要录入老师的数量");
        int count = sc1.nextInt();
        for (int i = 0; i < count; i++) {
            Scanner sc = new Scanner(System.in);    //  如果写在for外面 第二次循环会直接sout 21和23行，所以每一次循环输入都需要new一次
            System.out.println("请输入老师的名字");
            String sName = sc.nextLine();
            System.out.println("请输入老师的年龄");
            int sAge = sc.nextInt();
            Teacher teacher = new Teacher(sName, sAge);
            arrList.add(teacher);
        }
        arrList.forEach((e) -> {
            System.out.println(e);
        });
        System.out.println(arrList);
    }
}
