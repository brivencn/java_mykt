package Follow.Days20;

import java.util.ArrayList;

/**
 * @Author 陈帅
 * @Date 2023/12/10 16:49
 * @QQ 976104170
 * @Description
 **/

public class Test6 {
    public static void main(String[] args) {
        // 分析查看源码 ArrayList扩容
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
//        list.remove(3);

        list.add("8");
        list.add("9");
        list.add("10");
        list.add("1111111111");
        System.out.println(list);
    }
}
