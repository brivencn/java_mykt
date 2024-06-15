package Follow.Days19;

import java.util.ArrayList;

/**
 * @Author 陈帅
 * @Date 2023/12/9 15:00
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) {
        // for each 循环
        for (int i : new int[]{1, 2, 3, 4, 5, 6}) {
            System.out.println(i);
        }

        System.out.println("=----------增强for循环遍历 String[]");
        String[] str = new String[]{"我", "是", "猪"};
        for (String i : str) {
            System.out.println(i);
        }

        System.out.println("-----------------增强for循环 遍历 ArrayList 集合");
        ArrayList<String> strs = new ArrayList<>();
        strs.add("Arraylist01");
        strs.add("Arraylist02");
        strs.add("Arraylist03");
        strs.add("Arraylist04");
        for (String str1 : strs) {
            System.out.println(str1);
        }
    }
}
