package Follow.Days20;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @Author 陈帅
 * @Date 2023/12/10 18:53
 * @QQ 976104170
 * @Description
 **/

public class Test7 {
    public static void main(String[] args) {
        // Vector 基本和 ArrayList用法一致
        Vector<String> str = new Vector<>();
        System.out.println(str);
        str.add("wo");
        str.add("ni");
        str.add("zhu");
        System.out.println(str);
        str.set(1,"ta");
        str.add(1, "made");
        str.remove(3);
        System.out.println(str);

        //
        Test8 test8 = new Test8();
//        test8.age   类外访问test8的age是 私有修饰的 访问不了

    }
}
