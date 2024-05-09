package Follow.Days28;

import java.io.*;

/**
 * @Author 陈帅
 * @Date 2023/12/22 12:02
 * @QQ 976104170
 * @Description
 **/

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 字节缓冲流 （输入 输出）
        // 复制图片 byte数组
        FileInputStream inputStream = new FileInputStream("C:\\Users\\97610\\Pictures\\微信图片_20231121002406.jpg");
        byte[] bytes = new byte[1024 * 8];
        int len;
        FileOutputStream outputStream = new FileOutputStream("D:\\hardwork\\shuangshuang\\aiss.jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        int count = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
            count++;
        }
        System.out.println(count);
        inputStream.close();
        bufferedOutputStream.close();
    }
}
