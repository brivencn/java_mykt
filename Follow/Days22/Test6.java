package Follow.Days22;

import java.io.File;

/**
 * @Author 陈帅
 * @Date 2023/12/12 20:23
 * @QQ 976104170
 * @Description 通过递归算法 实现获取一个目录下 所有的目录,文件 名称字符串
 **/

public class Test6 {
    public static void main(String[] args) {
        String pathName = "D:\\shuangshuang";
        File file = new File(pathName);
        showFilename2(file);
    }

    /**
     * @Author 陈帅
     * @Description 递归1 有点问题 会走exists判断的输出
     * @Date 2023/12/12 20:56
     * @Param [file]
     * @Return void
     **/
    public static void showFileName(File file) {
        if (file == null)
            return;
        if (file.exists())
            System.out.println("file not exists" + file.getPath());

        // 判断目录是否是文件 or 目录
        if (file.isDirectory()) {
            for (File listFile : file.listFiles())
                showFileName(listFile);
            String p2 = file.getPath();
            System.out.println(file.delete() ? p2 + "目录删除成功" : p2 + "目录删除失败");
        }
        if (file.isFile()) {
            String p1 = file.getPath();
            System.out.println(file.delete() ? p1 + "文件删除成功" : p1 + "文件删除失败");
        }
    }

    /**
     * @Author          陈帅
     * @Description     递归删除文件夹
     * @Date            2023/12/12 21:23
     * @Param           [file]
     * @Return          void
     **/
    public static void showFilename2(File file) {
        File[] files = file.listFiles();
        if (files == null)
            return;
        for (File file1 :
                files) {
            if (file1.isDirectory())
                showFilename2(file1);
            String absolutePath = file1.getAbsolutePath();
            if (file1.isFile())
                System.out.println(file1.delete() ? absolutePath + "文件删除成功" : absolutePath + "文件删除失败");
        }
        String ab1 = file.getAbsolutePath();
        System.out.println(file.delete() ? ab1 + "文件夹删除成功" : ab1 + "文件夹删除失败");

    }
}
