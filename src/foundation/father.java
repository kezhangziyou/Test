package foundation;

/**
 * Created by 刘权 on 2020-2-24.
 */
public abstract class father {

    int i = 0;

    public void aaa() {
        int a = 1;//实例方法直接赋值
    }

    public void get() {
        System.out.println("i的值为"+i);
    }

    public abstract void setI(int i);//抽象方法没有方法体，也就是没有成员变量




}
