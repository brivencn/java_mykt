package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/10 14:46
 * @QQ 976104170
 * @Description
 **/

public class Test1 {
    public static void main(String[] args) {
        // 泛型类
        Animals<String> stringAnimals = new Animals<>();
        stringAnimals.setName("王麻子");
        System.out.println(stringAnimals.getName());

        Animals animals = new Animals();
        System.out.println(animals.show(123.1));
    }
}
