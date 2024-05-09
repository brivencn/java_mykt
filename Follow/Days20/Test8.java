package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/11 00:10
 * @QQ 976104170
 * @Description
 **/

public class Test8 {
    private int age;

    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.age = 10;     // 内部访问private 可以
        System.out.println(test8.age);

        TestLinkedList<String> list = new TestLinkedList<>();
        list.add("abc");
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println("end");
    }
}
