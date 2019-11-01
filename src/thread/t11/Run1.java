package thread.t11;



public class Run1 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			//当前线程是main线程，从未中断过。
			System.out.println("是否停止1="+thread.interrupted());
			System.out.println("是否停止2="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

