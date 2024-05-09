package Follow.Days08.Interface;

public class DogImpl extends Dog implements Tool {  //  DogImpl 是外部类
    private int dog_1 = 1;
    private static int dog_2 = 2;

    @Override
    public void eat() {
        System.out.println("狗子爱吃粑粑");
    }

    @Override
    public void wang() {
        System.out.println("狗子会汪汪叫，不是所有动物都会，只是狗的抽象类定义了");
    }

    @Override
    public void useHand() {
        System.out.println("狗子会用手，是Tool接口定义的");
    }

    /*
     * 成员内部类
     * 内部类，可以访问外部类的私有方法 私有属性
     * 内部类 用private修饰 实际开发中 不让外界访问 保护数据安全性
     * */
    private class DogInner {
        public void dogInner() {
            System.out.println(dog_1);
        }
    }

    /*
     * 静态成员内部类
     * 只能访问外部类的静态方法成员
     * */
    private static class DogInnerTwo {
        public void dogInner() {
            go();
            System.out.println(dog_2);
        }
    }

    /*
     * 方法内部类
     *
     * */
    public void funcInnerObject() {
        int code = 200;
        class InnerObject {
            public void go() {
                System.out.println("---------------");
                System.out.println("方法内部类，go方法");
                System.out.println(code);
                System.out.println(code_200);
                System.out.println(dog_1);
                dogOuter();
                DogImpl.go();
            }
        }
        InnerObject innerObject = new InnerObject();
        innerObject.go();

    }

    /*
     * 对内部类进行访问
     * */
    public void dogOuter() {
        DogInner dogInner = new DogInner();
        dogInner.dogInner();
        DogInnerTwo dog2 = new DogInnerTwo();
        dog2.dogInner();
    }

    public static void go() {
        System.out.println("go");
    }
}
