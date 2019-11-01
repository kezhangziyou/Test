package jdk.jiekou;

/**
 * @author zhangke
 * @version 1.0
 * @className TestDemo
 * @description TODO 接口式函数编程
 * @date 2019/6/27 2:56 PM
 **/
public class TestDemo {
	//接口式编程
	public static void main(String[] args) {

		IMessage iMessage = new IMessage() {
			@Override
			public void print() {
				System.out.println("hello world");

			}
		};
		iMessage.print();
		//函数式编程，如果方法体重有多行语句，这需要大括号{}
		IMessage iMessage1 = () -> System.out.println("hello iMessage1");
		//而在Java8中，针对函数式编程接口，可以这样定义：
		IMessage iMessage2 = () -> {
			System.out.println("hello world1,iMessage2");
			System.out.println("hello world2 iMessage2");
			System.out.println("hello world3 iMessage2");
		};
		iMessage1.print();
		iMessage2.print();
	}
}