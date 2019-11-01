package functional.expression.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className Consumer
 * @description 自定义函数式接口
 * @date 2019/11/1 11:44 AM
 **/
@FunctionalInterface
interface AbstractConsumer {
	/**
	 * 定义一个抽象方法accept
	 * @param o
	 */
	void accept(Object o);
}