package Follow.Days04;

public class ClassDemoOne {
    private String name;
    private int age;

    public ClassDemoOne() {
//        int anyNum = 0;   // 如果this不在方法内的第一条 会报错：java: 对this的调用必须是构造器中的第一个语句
        this("默认名称", 0);    // 无参构造 通过this关键字直接调用其他有参构造方法 this 就指代了 ClassDemoOne, 并且this构造语句必须放在第一条
    }

    public ClassDemoOne(String name) {
        this.name = name;
    }

    public ClassDemoOne(int age) {
        this.age = age;
    }

    public ClassDemoOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ClassDemoOne d2 = new ClassDemoOne();
        System.out.println(d2.toString());
        d2.a1();
        d2.a2();
    }

    @Override
    public String toString() {
        return "ClassDemoOne{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void a1() {
        System.out.println("a1方法");
    }

    public void a2() {
        System.out.println("a2方法，立刻调用a1方法：");
        a1();

    }
}
