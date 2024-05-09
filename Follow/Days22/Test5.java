package Follow.Days22;

/**
 * @Author 陈帅
 * @Date 2023/12/12 20:11
 * @QQ 976104170
 * @Description
 **/

public class Test5 {
    public static void main(String[] args) {
        // 递归 阶乘

        /*
        * jc(3)
        *
        * 3 * jc(2)
        *      2 * jc(1)
        *           1
        * 3 * 2 * 1 = 6
        * */
        System.out.println(jc(3));

    }
    public static int jc(int i) {
        if (i == 1)
            return 1;
        else
            return i * jc(i - 1);
    }
}
