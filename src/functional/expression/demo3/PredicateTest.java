package functional.expression.demo3;

import org.junit.Assert;

import java.util.function.Predicate;

/**
 * @author zhangke
 * @version 1.0
 * @className PredicateTest
 * @description
 * @date 2019/11/1 2:16 PM
 **/
public class PredicateTest {
	public static  void main(String [] args){
		predicateTest();

	}
	/**
	 * Predicate测试
	 * Predicate为函数式接口，predicate的中文意思是“断定”，即判断的意思，
	 * 判断某个东西是否满足某种条件； 因此它包含test方法，根据输入值来做逻辑判断，
	 * 其结果为True或者False。
	 */
	private static void predicateTest() {
		Predicate<String> p = o -> o.equals("test");
		Predicate<String> g = o -> o.startsWith("t");

		/**
		 * negate: 用于对原来的Predicate做取反处理；
		 * 如当调用p.test("test")为True时，调用p.negate().test("test")就会是False；
		 */
		Assert.assertFalse(p.negate().test("test"));
		System.out.println(p.test("test"));


		/**
		 * and: 针对同一输入值，多个Predicate均返回True时返回True，否则返回False；
		 */
		Assert.assertTrue(p.and(g).test("test"));
		System.out.println();

		/**
		 * or: 针对同一输入值，多个Predicate只要有一个返回True则返回True，否则返回False
		 */
		Assert.assertTrue(p.or(g).test("ta"));
		System.out.println();
	}
}