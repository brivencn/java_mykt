package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/10 15:08
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) {
        Programmer<String> pro = new ProgrammerImpl<>();
        System.out.println(pro);
        String show = pro.show("123");

        System.out.println(show);
        ProgrammerImpl<String> pro1 = (ProgrammerImpl<String>) pro;
        String s = pro1.showTime("456", 89);
        System.out.println(s);
        System.out.println(pro1);
    }
}
