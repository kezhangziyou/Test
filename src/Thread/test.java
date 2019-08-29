package Thread;

/**
 * @author zhangke
 * @version 1.0
 * @className mysqlConnectionTest
 * @description TODO 当前线程的名字和唯一标识
 * @date 2019/3/4 下午2:43
 **/
public class test {
    public static  void main(String [] args){
       Thread runThread= Thread.currentThread();
        System.out.println(runThread);
        System.out.println(runThread.getName());//main
        //取得线程的唯一标识
        System.out.println(runThread.getId());//1

    }
}