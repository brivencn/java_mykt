package Follow.Days20;

/**
 * @Author 陈帅
 * @Date 2023/12/10 15:07
 * @QQ 976104170
 * @Description
 **/

public class ProgrammerImpl<T> implements Programmer<T> {
    @Override
    public T show(T t) {
        return t;
    }

    /**
     * @Author          陈帅
     * @Description      M是泛型方法， T是泛型接口和泛型类
     * @Date            2023/12/10 15:23
     * @Param           [t, m]
     * @Return          T
     **/
    public <M> T showTime(T t, M m) {
        System.out.println(m);
        return t;
    }
}
