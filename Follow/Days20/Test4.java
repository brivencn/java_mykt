package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/10 15:57
 * @QQ 976104170
 * @Description
 **/

public class Test4 {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 45);
        System.out.println(sum);
        String sumStr = sumStr(1, 2, 3, 45);
        System.out.println(sumStr);
    }

    public static int sum(int... c) {        // 可变参数... 放在参数最后面，底层是数组封装传递给方法
        int res = 0;
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
            res += c[i];
        }
        return res;
    }

    public static String sumStr(int... c) {
        int res = 0;
//        int[] cs = c;
        for (int c1 : c) {
            res += c1;
        }
        return res + "";
    }
}
