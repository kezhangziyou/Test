package thread.t7;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
