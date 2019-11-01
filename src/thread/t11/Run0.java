package thread.t11;

/**
 * @author zhangke
 * @description //TODO 停止线程的测试
 * @date  2019/3/4
 * @return 
 **/


public class Run0 {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();//并没有停止线程
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
