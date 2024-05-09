package Follow.Days10;

import java.util.Scanner;

/**
 * @Author 陈帅
 * @Date 2023/11/30 14:41
 * @QQ 976104170
 * @Description
 **/

public class TestSettingTemp {
    public static char a;
    public static byte b;
    public static short c;
    public static int d;
    public static long e;
    public static float f;
    public static double g;
    public static boolean h;
    /**
     * @Author          陈帅
     * @Description
     * @Date            2023/11/30 14:42
     * @Param           [args]
     * @Return          void
     **/
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc);
//        int i = sc.nextInt();
//        System.out.println(i);
        //  输出对象的原理
        Object o = new Object();
        System.out.println(o);
        System.out.println(o.getClass().getName() + "@" + Integer.toHexString(o.hashCode() ));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        String str1 = "陈帅";
        String str2 = "唐爽";
        System.out.println(str1.equals(str2));
    }
}
