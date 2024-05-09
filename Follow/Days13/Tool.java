package Follow.Days13;

/**
 * @Author 陈帅
 * @Date 2023/12/3 17:15
 * @QQ 976104170
 * @Description
 **/

public class Tool {
    private Tool() {

    }

    public static void minToMAx(byte[] array) {
        if (array.length == 0) {
            System.out.println("byte[]为空");
        } else {
            byte[] newArray;

            for (int i=0;i<array.length-1;i++) {
                for (int x=i+1;x<array.length;x++) {
                    System.out.println(array[i]);
                    System.out.println(array[x]);
                }
            }
        }
    }
}
