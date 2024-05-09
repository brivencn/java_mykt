package Follow.Days07;

public class AnimalOperation {
    // 父类类型作为方法参数，当用到方法时，使用时传递子类对象，多态的优点之一，易于扩展，减少代码
    public static void animalEat(AnimalParent animalParent) {
        animalParent.eat();
    }
}
