package Follow.Days22;

import java.io.File;

/**
 * @Author 陈帅
 * @Date 2023/12/12 17:32
 * @QQ 976104170
 * @Description
 **/

public class Test3 {
    public static void main(String[] args) {
        //  判断 isDirectory isFile exists
        String fileName = "D:\\shuangshuang\\wo\\ai\\ni\\woaini.jpg\\woaini.jpg";
        File file = new File(fileName);
        System.out.println(file.isFile());  //  true
        System.out.println(file.isDirectory()); //  false
        System.out.println(file.exists());  // true
    }
}
