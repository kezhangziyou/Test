package thread.t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		 //mythread.start();//therad调用的
		mythread.run();//main线程调用的
	}
}
