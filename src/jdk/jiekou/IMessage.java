package jdk.jiekou;

/**
 * @author zhangke
 * @description  定义一个接口，接口中的抽象方法必须有子类，
 * @date  2019/11/1
 * @return
 **/
//FunctionalInterface表示这是函数式编程接口
@FunctionalInterface
public interface IMessage {
	/**
	 * 只能有一个方法
	 */
	void print();
}
