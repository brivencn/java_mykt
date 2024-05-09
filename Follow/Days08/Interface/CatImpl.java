package Follow.Days08.Interface;

public class CatImpl implements Animals{
    public CatImpl() {
        super();    //  访问Object的无参构造方法
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
