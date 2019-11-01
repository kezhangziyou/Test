package thread.t11;



public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
        System.out.println("是否停止1="+Thread.interrupted());
        //interrupted方法是静态方法，可以中断线程，同时清楚其中断状态
        System.out.println("是否停止2="+Thread.interrupted());
		System.out.println("end!");
	}
}
