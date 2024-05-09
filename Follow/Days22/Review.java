package Follow.Days22;

/**
 * @Author 陈帅
 * @Date 2023/12/12 16:18
 * @QQ 976104170
 * @Description 复习前面的内容
 **/

public class Review {
    // 成员变量 8种基本数据类型
    boolean bl; // false
    char ch;    //
    byte bt;    //  0
    short st;   //  0
    int it;     //  0
    long lg;    //  0
    float ft;   //  0.0
    double db;  //  0.0

    public static void main(String[] args) {
        /*
         * 1.复习数据类型
         *   Java有2大数据类型：1.引用类型; 2.内置类型
         *   内置数据类型有：boolean,char,byte,short,int,long,float,double
         *
         * */

        // 方法里定义的局部变量不初始化编译阶段就报错 但是成员方法不初始化会有默认值
//        Integer inte;
//        int it;
//        System.out.println(inte);
//        System.out.println(it);

        // 类里成员变量可以不需要初始化，8种基本数据类型有初始值
        Review review = new Review();
        System.out.println(review.bl);
        System.out.println(review.ch);
        System.out.println(review.bt);  //  范围 -128（10000000） ~ 127（01111111）
        System.out.println(review.st);
        System.out.println(review.it);
        System.out.println(review.lg);
        System.out.println(review.ft);
        System.out.println(review.db);

        System.out.println("=========================================================================================");

//        Byte bt = 128;  //  java: 不兼容的类型: int无法转换为java.lang.Byte
        Byte bt = 127;  //  二进制 1111111， 因为byte占一个字节（8位）有符号，所以数值只能占7位，第一位为符号位 （0代表+,1代表-？？？）

        System.out.println("=========================================================================================");

        // long double
        long l1= 9223300000000000000L;  //  十进制 有 19位，开头是92233 末尾用l 或者 L 表示 标准用L ，因为l容易被看成是1
//        double d1 = 36.000000000000001;   //  小数点后有15位数，如果15位 趋近0 可能会精度丢失 最后变成了36.0
//        double d1 = 36.999999999999999;     //  如果15位 趋近1  精度丢失， 变成了37.0
        double d1 = 26.D;   //  double类型同样不能表示精确的值，如货币；
//        float f1 = 7.;  //  报错java: 不兼容的类型: 从double转换到float可能会有损失， 因为默认的写法 默认是double类型
        float f1 = 7.f; //浮点数不能用来表示精确的值，如货币；
        System.out.println(d1);
        System.out.println(f1);

    }
}
