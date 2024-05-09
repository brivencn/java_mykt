package Follow.Days21;

/**
 * @Author 陈帅
 * @Date 2023/12/11 16:20
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) {
        /*
        * & 按位与运算符
        * */
        int a = 2;  // 二进制 10 前面补30个0
        int b = 3;  // 二进制 11 前面补30个0
        int c = a & b;  // 0&1=0 ,1&1=1 所以结果是 10 转换成十进制就是 2
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
