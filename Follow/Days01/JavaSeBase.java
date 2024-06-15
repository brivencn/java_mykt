package Follow.Days01;
/**
	JavaSe基础语法
*/
public class JavaSeBase {
    public static void main(String[] args) {
        // 1.------------------------------
		/**
         * java之父 詹姆斯.高斯林 James Gosling
         * 1995年推出java语言
         * 			2004年java1.5重大更新版本
         * 			2014年java1.8重大更新
         * 			2018年 jdk11
         *
		 */
        // 一.字符的+操作是拿字符在底层的数值进行计算
        int num=20;
        // 'a'的底层数字类型是65 ASCII码
        char word='A';
		/*
			byte short char 将被提升为int类型
			整个加法表达式将自动提升到表达式中最高等级操作数同样的类型
			等级顺序: byte,short,char->int->long->float->double
			底层ASCII码
			整数除以整数结果不带小数点，如果要带小数点其中一个数需要是浮点数
		*/
        System.out.println(num+word);

        //	2.--------------------------------

        // 字符串的+操作 此时作为连接运算符，而不是算术运算符
        int nums=26;
        System.out.println("123的年龄:"+nums);
        System.out.println(nums+1+"岁的帅帅爱"+num+"岁的妹妹");
        System.out.println("帅帅的年龄:"+nums+1);// 261

        //	3.--------------------------------

		/*
			x++先赋值x再计算+1
			++x先计算+1再赋值x
			例子1：
				int x=10;
				int y=x++ + x++ + x++
				x=13 y=10+11+12 y=33
		*/

        // 4.--------------------------------
		/*
			& 与 && 短路与
			| 或 || 短路或
			^ 异或
			! 非
			三元表达式：关系表达式为boolean类型 关系表达式 ? 表达式1 : 表达式2
		*/

        // 5.--------------------------------
		/*
			for while do while 循环的区别， for循环中定义的变量只能在for结构里使用
		*/
        // javase基础语法。

    }
}
