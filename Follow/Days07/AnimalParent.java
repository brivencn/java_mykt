package Follow.Days07;

public abstract class AnimalParent {
    public int weight;
    public static int height;

    // 构造方法，子类中的构造方法默认调用父类的无参构造方法 默认在第一行加了 super();

    public AnimalParent() {
        System.out.println("我是父类的无参傻der");
    }

    public AnimalParent(int weight) {
        this.weight = weight;
        System.out.println("我是父类的有参傻der");
    }


    public abstract void eat();

    public void show() {
        System.out.println("show出属性：weight:" + weight + ",height:" +height);

    }
}
