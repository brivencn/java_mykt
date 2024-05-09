package Follow.Days08;

/*
 * 工作人员抽象类
 * */
public abstract class Staff {
    private String name;    // 姓名
    private int number;     //  工号
    private double salary;  //  薪水

    public Staff() {
    }

    public Staff(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public abstract void work();    //  工作

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
