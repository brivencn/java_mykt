package Follow.Days21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author 陈帅
 * @Date 2023/12/11 21:22
 * @QQ 976104170
 * @Description
 **/

public class Test5 {
    public static void main(String[] args) {
        /*
         * 通过Scanner输出字符串 统计字符串 中字符 出现的个数
         * 要求使用HashMap实现
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串...");
        String str = sc.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character charAt = str.charAt(i);
            Integer val = hashMap.get(charAt);
            if (val == null) {
                val = 1;
            } else {
                val++;
            }
            hashMap.put(charAt, val);
        }
        System.out.println("KeySet获取结果：");
        // 一种遍历方式
        for (Character key :
                hashMap.keySet()) {
            Integer i = hashMap.get(key);
            System.out.println("字符：" + key);
            System.out.println("出现次数：" + i);
            System.out.println("------------------------------");
        }

        System.out.println("Map.Entry获取结果：");
        // Map.Entry
        for (Map.Entry<Character, Integer> entry :
                hashMap.entrySet()) {
            System.out.println("字符："+ entry.getKey());
            System.out.println("出现次数："+ entry.getValue());
            System.out.println("------------------------------");

        }
    }
}
