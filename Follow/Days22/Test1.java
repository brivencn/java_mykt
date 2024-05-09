package Follow.Days22;

import java.io.File;

/**
 * @Author 陈帅
 * @Date 2023/12/12 17:09
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) {
        //  创建File对象
        File file1 = new File("D:\\hardwork\\test1.txt");
        System.out.println(file1);
        File file2 = new File("D:\\hardwork\\", "test1.txt");
        System.out.println(file2);
        File file3 = new File("D:\\hardwork\\");
        File file4 = new File(file3, "test1.txt");
        System.out.println(file3);
        System.out.println(file4);
    }
}
