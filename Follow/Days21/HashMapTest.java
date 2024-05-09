package Follow.Days21;

import java.util.HashMap;

/**
 * @Author 陈帅
 * @Date 2023/12/11 13:43
 * @QQ 976104170
 * @Description
 **/

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println(hashMap.put(1, "陈帅"));   // 返回null，返回上一个值 这里没有上一个值
        System.out.println(hashMap.put(1, "陈帅"));   // 返回陈帅，返回上一个值
        System.out.println(hashMap.put(2, "唐爽"));
        hashMap.put(2, "唐爽");
        hashMap.remove(1);
        hashMap.put(1, "蠢逼");
        hashMap.put(2, "小仙女爽爽");
//        hashMap.clear();
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("陈帅"));
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.get(1));

    }
}
