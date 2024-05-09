package Follow.Days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 陈帅
 * @Date 2023/12/10 16:03
 * @QQ 976104170
 * @Description
 **/

public class Test5 {
    public static void main(String[] args) {
        //Arrays.asList
        List<String> list = Arrays.asList("我", "今天", "想睡觉");
//        list.add("123");        // 不能添加
//        list.remove(1);     // 不能删除
        list.set(0, "wo");      //可以修改
        System.out.println(list);
    }
}
