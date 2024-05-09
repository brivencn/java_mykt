package Follow.Days12;

import java.util.Scanner;

/**
 * @Author 陈帅
 * @Date 2023/12/2 11:36
 * @QQ 976104170
 * @Description
 **/

public class Test {
//    public static void main(String[] args) {
//        AnimalParentInterface cat = new Cat();
//        System.out.println(cat instanceof Dog);
//    }

//    public static void main(String[] args) {
//        String str1 = "abcdefg";
//        String str2 = new String("abcdefg");
//        System.out.println(str1.equals(str2));
//        System.out.println(str1);
//        System.out.println(str2);
//        char[] c1 = {'a', 'b', 'c'};
//        System.out.println(c1.length);
//        System.out.println(c1[0]);
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        for (int i = 0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

