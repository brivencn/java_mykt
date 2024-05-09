package Follow.Days21;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author 陈帅
 * @Date 2023/12/11 15:24
 * @QQ 976104170
 * @Description
 **/

public class Student {
    private String number;
    private String name;

    public Student(String number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    public static void main(String[] args) {
        /*
           第一次添加s1 不走下面代码，后面添加s2 s3 s4 会走下面源码判断hash值是否一样，因为对象内的number 和 name是一样的所以
           hash值是一样的， 然后走&&后的判断，k != key 走到 || 后的代码 判断 key是否equals k，走到Student重写的equals方法
        *  Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
        * */
        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student("1001", "陈帅"); //  Follow.Days21.Student@6a5fc7f7
        Student s2 = new Student("1001", "陈帅"); //  Follow.Days21.Student@3b6eb2ec
        Student s3 = new Student("1001", "陈帅"); //  Follow.Days21.Student@1e643faf
        Student s4 = new Student("1001", "陈帅"); //  Follow.Days21.Student@6e8dacdf
        Student s5 = s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        hashSet.add(s1);    //
        hashSet.add(s2);    //  未重写 Student的hashCode 和 equals方法时  s1 s2 s3 s4 被认为是不同的对象，因为引用地址不同
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);    //  引用地址相同  被认为是相同的对象，所以add失败
        System.out.println(hashSet.size()); // 重写hashCode 和 equals方法后 size = 1
        System.out.println(hashSet);
    }
}
