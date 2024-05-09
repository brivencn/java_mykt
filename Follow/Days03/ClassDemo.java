package Follow.Days03;

/*
 * 1.类
 * 我定义一个人类
 *
 * */
public class ClassDemo {
    byte chestSize;    //胸部大小
    short height;  //身高
    short weight;  //体重
    short age;   //年龄
    char sex;   //性别
    String name;    //姓名

    public void eat() {
        System.out.println("吃");
    }

    public void drink() {
        System.out.println("喝");
    }

    // byte chestSize, short height, short weight, short age, char sex, String name
    public void self() {
        char sexCall = (sex == '男') ? '他' : '她';
        System.out.println("这里有一个" + age + "岁的" + sex
                + '人' + sexCall + "的名字叫做" + name + sexCall + "的胸部大小是" + chestSize + "身高:" + height + "体重:" + weight);
    }

    public static void main(String[] args) {
        /*
         *
         * */
        System.out.println("定义了一个人类");
    }
}

