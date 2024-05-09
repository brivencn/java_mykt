package Follow.Days22;

import java.io.File;

/**
 * @Author 陈帅
 * @Date 2023/12/12 18:30
 * @QQ 976104170
 * @Description
 **/

public class Test4 {
    public static void main(String[] args) {
//        String fileName = "D:\\shuangshuang\\wo\\ai\\ni\\woaini.jpg\\woaini.jpg";
        String fileName = "D:\\shuangshuang\\wo\\ai\\ni\\woaini.jpg\\";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath()); //  获取绝对路径字符串
        System.out.println(file.getPath()); //  获取抽象路径名 转化 路径名字符串
        System.out.println(file.getName()); //  获取文件或文件名 名称字符串
        String[] lists = file.list();   //  获取目录下的所有内容，返回字符串数组
        for (String list :
                lists) {
            System.out.println(list);
        }
        File[] files = file.listFiles();    //  获取目录下的所有内容，返回File对象数组
        for (File listFile : files) {
            System.out.println(listFile);
        }

    }
}
