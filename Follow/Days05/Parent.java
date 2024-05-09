package Follow.Days05;

/*
 * 人的基类
 * 练习，父类 基类 BaseClass
 * */
public class Parent extends GParent {
    public String name; // 人名
    protected int age;    //  年龄
    private int height; //  身高
    private int weight; //  体重

    public Parent(int age) {
        this.age = age;
    }

    public void eatMate() {
        System.out.println(
                "痴迷爱情，我是你爹"
        );
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
