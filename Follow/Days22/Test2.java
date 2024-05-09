package Follow.Days22;

import java.io.File;
import java.io.IOException;

/**
 * @Author 陈帅
 * @Date 2023/12/12 17:21
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) throws IOException {
        //  创建目录 创建文件夹
        File f1 = new File("D:\\shuangshuang\\wo\\ai\\ni\\woaini.jpg");
        File f2 = new File(f1, "woaini.jpg");
        System.out.println(f1.mkdirs());
        System.out.println(f2.createNewFile());
    }
}
