package thread.t7.isaliveOtherTest;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		//讲线程对象以构造参数的方式传递给Thread对象
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
