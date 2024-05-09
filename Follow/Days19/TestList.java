package Follow.Days19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 陈帅
 * @Date 2023/12/9 14:04
 * @QQ 976104170
 * @Description
 **/

public class TestList {
    public static void main(String[] args) {
        Collection<Object> collection = new ArrayList<>();    // Collection接口， 多态的方式
        collection.add("string1");
        collection.add("string2");
        collection.add("string3");
        collection.add("string4");

        System.out.println(collection);
        System.out.println("----------------------");
//        collection.remove("string3"); //  Collection的remove方法是根据对象值去删除，并且删除后数组保持有序
//        collection.get(); // Collection中没有get方法，list中才有.

        List list = (List) collection;
        list.add(1, "string666");
        Iterator iterator = list.iterator();


        while (iterator.hasNext()) {
            System.out.println("while里：" + iterator.next());
        }
        System.out.println(iterator);
        collection.remove("string1");   //
        list.remove(1);             // list 是 collection强转后的，但是他们操作同一内存地址的数据
        list.set(1, "STRING3");
//        collection.set();     // collection没有set
        System.out.println(list);
        System.out.println(collection);
//        collection.forEach((e) -> {
//            System.out.println(e);
//        });       // 循环迭代collection

    }
}
