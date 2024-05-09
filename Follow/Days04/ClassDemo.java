package Follow.Days04;

public class ClassDemo {
    private int age;    // 年龄
    private char sex;   // 性别
    public String name; // 姓名

    public ClassDemo() {
        System.out.println("初始化");
    }

    public ClassDemo(int age) {
        this.age = age;
    }

    public ClassDemo(char sex) {
        this.sex = sex;
    }

    public ClassDemo(int age, char sex) {
        this.sex = sex;
        this.age = age;
    }

    public void setAge(int age) {
        if (age < 0 || age >= 125) {
            System.out.println("赋值范围有误");
        } else {
            this.age = age;
            System.out.println("年龄赋值为" + this.age);
        }
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "姓名："+name+"年龄："+age+"性别："+sex;
    }

}
