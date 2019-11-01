package thread.runnable;

/**
 * @author zhangke
 * @version 1.0
 * @className runnableTest
 * @description TODO
 * @date 2019/2/27 下午6:53
 **/
public class runnableTest implements  Runnable {
    @Override
    public void run() {
        System.out.println("runnable");
    }
    public static  void main(String [] args){
        runnableTest t =new runnableTest();
        Thread thread= new Thread(t);
        thread.start();
    }
}