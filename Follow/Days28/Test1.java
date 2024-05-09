package Follow.Days28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 陈帅
 * @Date 2023/12/18 17:02
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        * 字节写入
        * write  int （ASCII码， 97 =a），byte数组 （new byte[]{97, 98}），byte数组 偏移量 长度-1 (new byte[]{97, 98}, 1, 4)
        *
        * */
        FileOutputStream fileOutputStream = new FileOutputStream(new File("days28.test1.txt"));
        fileOutputStream.write(new byte[]{97, 98, 99, 100, 101}, 1 , 4);
        fileOutputStream.close();

    }
}
