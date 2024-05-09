package Follow.Days21;

import java.util.HashMap;

/**
 * @Author 陈帅
 * @Date 2023/12/11 19:48
 * @QQ 976104170
 * @Description
 **/

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put("key" + i, "val" + i);
        }
        hashMap.put(null, "valvalval");     // key 为null 的键值对 位置在 hashMap的最开头
        hashMap.forEach((k, v) -> {
            System.out.println("key=>" + k + ",val=>" + v);
        });
    }
}
