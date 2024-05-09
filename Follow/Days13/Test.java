package Follow.Days13;

import java.util.Scanner;

/**
 * @Author 陈帅
 * @Date 2023/12/3 14:58
 * @QQ 976104170
 * @Description
 **/

public class Test {
    public static void main(String[] args) {
//        String str1 = "woshizhu你是谁";
//        String str2 = str1.replace("你是谁", "你是猪");
//        System.out.println(str2);
//
//        String str1 = "我|不|爱|你|真|的|可|以|吗";
//        String[] str2 = str1.split("\\|");
//        System.out.println(str1);
//        System.out.println(str2);
//        int i = 97;
//        char c = (char) i;
//        System.out.println(c);
//        System.out.println(97 == 'a');
        // 统计大小写字母和数字出现个数
//        System.out.println('0' + 1);
        System.out.println("请输入一串字符，代码判断有多少个大写字母和小写字母以及数字");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("isEmpty");
            return;
        }
        // 小写，大写，数字 a97 A65 z122 Z90 '0'48 '9'57
//        int lowercaseLetters = 0, uppercaseLetters = 0, digit = 0;
        int lowercaseLetters = 0;
        int uppercaseLetters = 0;
        int digit = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowercaseLetters++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseLetters++;
            }
            if (ch >= '0' && ch <= '9') {
                digit++;
            }
        }
        System.out.println("小写字母：" + lowercaseLetters +"大写字母:" + uppercaseLetters + "数字:" + digit);
    }
}
