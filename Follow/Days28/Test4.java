package Follow.Days28;

import java.io.*;

/**
 * @Author 陈帅
 * @Date 2023/12/22 14:22
 * @QQ 976104170
 * @Description
 **/

public class Test4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("D:\\hardwork\\shuangshuang\\aini.txt")
        );
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("D:\\hardwork\\shuangshuang\\aini2.txt")
        );
        char[] chars = new char[1024];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            outputStreamWriter.write(chars, 0, len);
        }
        outputStreamWriter.write("\ni love u");
        inputStreamReader.close();
        outputStreamWriter.close();
    }

}
