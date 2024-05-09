package Follow.Days05;

public class TestMain {

    public static void main(String[] args) {
        /*
        * 数组预留方便传递数组参数
        * javac -encoding UTF-8 .\Follow\Days05\TestMain.java
         * java Follow.Days05.TestMain arg1 arg2 arg3
         * */
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
