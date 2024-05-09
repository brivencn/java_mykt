package Follow.Days21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * @Author 陈帅
 * @Date 2023/12/11 14:34
 * @QQ 976104170
 * @Description  基于hashMap实现hashSet的add方法
 **/

public class SsHashSet<E>{
    // hashMap
    private HashMap<E, Object> map;

    private static final Object PRESENT = new Object();

    public SsHashSet() {
        map = new HashMap<>();
    }

    public boolean add(E e) {
        // hashMap的put方法 如果是第一次添加 返回null，如果key值存在 返回key对应的值，并用新值覆盖
        return map.put(e, PRESENT) == null;
    }

    @Override
    public String toString() {
        return "SsHashSet{" +
                "map=" + map +
                '}';
    }

    public static void main(String[] args) {
        SsHashSet<String> SshashSet = new SsHashSet<>();
        SshashSet.add("我");
        SshashSet.add("是");
        SshashSet.add("你");
        System.out.println(SshashSet);
        System.out.println(Objects.hash(null));
    }
}
