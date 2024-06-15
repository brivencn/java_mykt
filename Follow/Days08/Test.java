package Follow.Days08;

public class Test {
    public static void main(String[] args) {
        Staff staff = new Manager("产品", 1, 10000.00, 100.00);
        staff.work();
        System.out.println("产品经理姓名：" + staff.getName());
        System.out.println("产品经理编号：" + staff.getNumber());
        System.out.println("产品经理工资：" + staff.getSalary());
//        system.out.println("产品经理奖金：" + staff.getBonus());
        Manager manager = (Manager) staff;
        System.out.println("强转产品经理奖金：" + manager.getBonus());
        System.out.println("强转产品经理姓名：" + manager.getName());
        System.out.println("强转产品经理编号：" + manager.getNumber());
        System.out.println("强转产品经理工资：" + manager.getSalary());
    }
}
