package thread.t8;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("run threadName="
					+ Thread.currentThread().getName() + " begin ="
					+ System.currentTimeMillis());
			//这里的当前线程是this.currentThread()
			Thread.sleep(2000);
			System.out.println("run threadName="
					+ Thread.currentThread().getName() + " end   ="
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
