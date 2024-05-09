package Follow.Days05;

public class Student extends Parent {
    public final int CODE = 200;
    public Student() {
        super(20);
    }
    public Student(int age) {
        super(20);
        System.out.println(111);
    }

    @Override
    public void eatMate() {
        super.eatMate();
        System.out.println(
                "痴迷爱情，你是我爹"
        );
    }

    public static void main(String[] args) {
        Student s1 = new Student(123);
        System.out.println(s1.toString());
        s1.eatMate();
        System.out.println(s1.age);
    }
}
