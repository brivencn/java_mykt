package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/10 14:47
 * @QQ 976104170
 * @Description  定义泛型类
 **/

public class Animals<E> {   //  泛型类
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public <M> M show(M e) {   // 泛型方法
        return e;
    }
}
