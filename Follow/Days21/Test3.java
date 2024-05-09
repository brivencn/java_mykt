package Follow.Days21;

import java.util.*;

/**
 * @Author 陈帅
 * @Date 2023/12/11 16:59
 * @QQ 976104170
 * @Description  Copy from Test2
 **/

public class Test3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("M001", 1);
        hashMap.put("M002", 2);
        hashMap.put("M003", 3);
        System.out.println(hashMap);
        System.out.println(hashMap.get("M001"));
        Integer orDefault = hashMap.getOrDefault("m002", 4);
        System.out.println(orDefault);
        // keySet方法 返回值是Set<K>类型
        Set<String> keys = hashMap.keySet();
        // 遍历HashMap集合方法1.遍历key 通过key 用get方法获取value
        for (String s : keys) {
            System.out.println(s);
            Integer value = hashMap.get(s);
            System.out.println("key=" + s + ",value=" + value);
        }
        // values方法 返回值是Collection<V>类型
        Collection<Integer> values = hashMap.values();
        for (Integer v :
                values) {
            System.out.println(v);
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println(entries.getClass());
        System.out.println("遍历HashMap集合方法2. 调用HashMap的entrySet方法");
        // 遍历HashMap集合方法2. 调用HashMap的entrySet方法 返回 Set<Map.Entry<K,V>>类型
        for (Map.Entry<String, Integer> stringStringEntry : entries) {
//            System.out.println(stringStringEntry.getClass());

            // stringStringEntry 底层 是用 node类实现了Map接口 的 Entry接口
            // static class Node<K,V> implements Map.Entry<K,V> {
            System.out.println(stringStringEntry);
            String key = stringStringEntry.getKey();    //
            Integer value = stringStringEntry.getValue();
            System.out.println("key=" + key + ",value=" + value);
        }

        // 遍历HashMap集合方法3. Iterator迭代器
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        System.out.println("----------遍历HashMap集合方法3. Iterator迭代器");
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
