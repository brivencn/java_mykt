package Follow.Days20;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈帅
 * @Date 2023/12/10 15:32
 * @QQ 976104170
 * @Description
 **/

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("双方的");
        list.add("双方的152");
        list.add("双方的1244");
        System.out.println(list);
        printList(list);

        List<?> list1 = new ArrayList<>();
//        list1.add("sfsfsf");  // List<?> 不能用于添加
        System.out.println(list1);
//        printList(list1);
    }
    public static void printList(List<?> listString) {
//        listString.add(1, "大师傅士大夫"); // List<?> 无法添加
        Object o = listString.get(0);       // 可以接收所有泛型类型 可以查询。
        System.out.println(o);
        System.out.println(listString);
    }
}
