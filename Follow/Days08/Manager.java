package Follow.Days08;

/*
 * 项目经理
 * */
public class Manager extends Staff {
    private double bonus;   //  奖金

    public Manager() {
    }

    public Manager(String name, int number, double salary, double bonus) {
        super(name, number, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("这是产品经理重写的work方法...");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
