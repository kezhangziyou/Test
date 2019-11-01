package thread.thread;

/**
 * @author zhangke
 * @version 1.0
 * @className threadTest
 * @description TODO
 * @date 2019/2/25 下午5:54
 **/
public class mythread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("mythread启动");
    }


}