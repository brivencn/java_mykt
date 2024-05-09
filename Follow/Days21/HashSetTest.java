package Follow.Days21;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author 陈帅
 * @Date 2023/12/11 13:51
 * @QQ 976104170
 * @Description
 **/

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashSet.add("a"));
        System.out.println(hashSet.add("b"));       // true
//        System.out.println(hashSet.add("b"));  // false
        System.out.println(hashSet.add("c"));
        System.out.println(hashSet.add("d"));
        System.out.println(hashSet.add("e"));
        System.out.println(hashSet);
        for (String str :
                hashSet) {
            System.out.println(str);
        }
//        Iterator<String> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
