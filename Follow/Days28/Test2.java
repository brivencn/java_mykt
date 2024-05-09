package Follow.Days28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author 陈帅
 * @Date 2023/12/18 17:40
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        FileInputStream fin = null;
        try {
            fout = new FileOutputStream("out.txt");
            fin = new FileInputStream("in.txt");
            int read;
            while ((read = fin.read()) != -1) {
                fout.write(read);
            }
            fout.close();
            fin.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
