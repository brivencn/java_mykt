package Follow.Days18;

import java.util.ArrayList;

/**
 * @Author 陈帅
 * @Date 2023/12/8 15:19
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) {
        // ArrayList<>
        ArrayList<String> arr = new ArrayList<>();
        arr.add("我");
        arr.add("是");
        arr.add("傻逼");
        System.out.println(arr);
        System.out.println(arr.get(0));
        arr.forEach((item) -> {
            System.out.println(item);
        });
        System.out.println("-------------------------------修改");
        String old = arr.set(2, "逗逼");
        System.out.println(old);
        arr.forEach((item) -> {
            System.out.println(item);
        });
        System.out.println("-------------------------------删除");
        String remove = arr.remove(0);
        System.out.println(remove);
        System.out.println("-----");
        arr.forEach((item) -> {
            System.out.println(item);
        });
    }
}
