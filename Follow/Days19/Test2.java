package Follow.Days19;

/**
 * @Author 陈帅
 * @Date 2023/12/9 15:22
 * @QQ 976104170
 * @Description
 **/

public class Test2 {
    public static void main(String[] args) {
        CatStatic cat1 = new CatStatic();
        CatStatic cat2 = new CatStatic();
        System.out.println(cat1.getAge());
        System.out.println(cat2.getAge());
        cat1.setAge(5);  // cat1对象修改了 static修饰的age属性，那么单机下所有该类对象 访问 static的age属性 值都是5
        System.out.println(cat1.getAge());
        System.out.println(cat2.getAge());
    }
}
