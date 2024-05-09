package Follow.Days08.Interface;

public interface Animals {
    int code_200 = 200;

    void eat();

    default void drink() {
        System.out.println("苦酒入喉");
    }
}
