package Follow.Days07;

public class Cat extends AnimalParent {
    public static int catPoint = 100;   //  猫的分数，100满分

    public Cat() {
        System.out.println("我是子类的无参 傻der");
    }

    public Cat(int weight) {
        super(weight);  // 不写这个默认访问父类无参
        System.out.println("我是子类的有参 傻der");
    }

    @Override
    public void eat() {
        System.out.println("猫咪在吃");
    }
    public void meow() {
        System.out.println("猫咪在叫");
        wow();
    }

    public static void wow() {
        System.out.println("狗叫");
//        meow(); // 静态方法中不能访问非静态方法或者属性 java: 无法从静态上下文中引用非静态 方法 meow()
    }

}
