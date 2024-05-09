package Follow.Days04;

public class Demo {
    public static void main(String[] args) {
//        ClassDemo Demo1 = new ClassDemo();
//        Demo1.setAge(27);
//        Demo1.name = "陈帅";
//        Demo1.setSex('男');
//        System.out.println(Demo1.toString());
//        ClassDemo Demo2 = new ClassDemo(26);
//        System.out.println(Demo2.toString());
//        ClassDemo Demo3 = new ClassDemo('男');
//        System.out.println(Demo3.toString());
//        ClassDemo Demo4 = new ClassDemo(26, '女');
//        System.out.println(Demo4.toString());
        ClassDemoOne d1 = new ClassDemoOne( "陈帅", 26);
        System.out.println(d1.toString());
        ClassDemoOne d2 = new ClassDemoOne();
        System.out.println(d2.toString());
    }
}
