package thread.thread;

/**
 * @author zhangke
 * @version 1.0
 * @className run
 * @description TODO
 * @date 2019/3/4 下午4:38
 **/
public class run {
    public static  void main(String [] args){
        mythread t=  new mythread();
        Thread t1=new Thread(t);
        t1.start();
    }
}