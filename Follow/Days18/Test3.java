package Follow.Days18;

import java.util.ArrayList;

/**
 * @Author 陈帅
 * @Date 2023/12/8 16:05
 * @QQ 976104170
 * @Description
 **/

public class Test3 {
    public static void main(String[] args) {
        Teacher cs = new Teacher("陈帅", 27);
        Teacher lz = new Teacher("黎真", 28);
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(cs);
        teachers.add(lz);
        System.out.println(teachers);
        for (int i =0; i< teachers.size();i++) {
            Teacher te = teachers.get(i);
            System.out.println("姓名：" + te.getName() + ",年龄：" + te.getAge());
        }
    }
}
