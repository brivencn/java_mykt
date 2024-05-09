package Follow.Days21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author 陈帅
 * @Date 2023/12/11 16:30
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("M001", "陈帅");
        hashMap.put("M002", "唐爽");
        hashMap.put("M003", "陈帅");
        System.out.println(hashMap);
        System.out.println(hashMap.get("M001"));
        String orDefault = hashMap.getOrDefault("m002", "爽爽");
        System.out.println(orDefault);
        // keySet方法 返回值是Set<K>类型
        Set<String> keys = hashMap.keySet();
        // 遍历HashMap集合方法1.遍历key 通过key 用get方法获取value
        for (String s : keys) {
            System.out.println(s);
            String value = hashMap.get(s);
            System.out.println("key=" + s + ",value=" + value);
        }
        // values方法 返回值是Collection<V>类型
        Collection<String> values = hashMap.values();
        for (String v :
                values) {
            System.out.println(v);
        }
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println(entries.getClass());
        for (Map.Entry<String, String> stringStringEntry : entries) {
            System.out.println(stringStringEntry.getClass());
            System.out.println(stringStringEntry);
        }


    }
}
