package Follow.Days19;

import java.util.ArrayList;

/**
 * @Author 陈帅
 * @Date 2023/12/9 15:54
 * @QQ 976104170
 * @Description
 **/

public class Test3 {
    public static void main(String[] args) {
        // 不指定泛型 JDK1.5之前 ArrayList的使用方式
        ArrayList arr = new ArrayList();
        arr.add("String1");     // 对象是Object类型
        arr.add("String2");
        arr.add("String3");
        arr.add("String4");     // 前面的元素都是String类型
        arr.add(5);             //  这里还能添加 int类型
        System.out.println(arr);
//        arr.remove(5);    // 如果根据对象去删除 元素，那么int5 会被当成index5去操作
        arr.remove("String1");
        System.out.println(arr);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("string");     // 对象是String类型
        System.out.println(arr2);
    }
}
