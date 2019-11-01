package thread.thread;

/**
 * @author zhangke
 * @version 1.0
 * @className threadTest
 * @description TODO
 * @date 2019/2/25 下午5:54
 **/
public class threadTest extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("启动");
    }
    public static  void main(String [] args){
        threadTest t = new threadTest();
        //t.start();
        //Thread 的构造函数不仅可以传入runable的接口，也可以传入thread的实现类
        Thread t1=new Thread(t,"A");
        t1.start();


    }

}