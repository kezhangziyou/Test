package functional.expression.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className ConsumerTest
 * @description
 * @date 2019/11/1 11:47 AM
 **/
public class AbstractConsumerTest {
	public static  void main(String [] args){
		//而在Java8中，针对函数式编程接口，可以这样定义：
		/**
		 * 上面已说明，函数式编程接口都只有一个抽象方法，因此在采用这种写法时，编译器会将这段函数编译后当作该抽象方法的实现。
		 如果接口有多个抽象方法，编译器就不知道这段函数应该是实现哪个方法的了。
		 因此，=后面的函数体我们就可以看成是accept函数的实现。
		 输入：->前面的部分，即被()包围的部分。此处只有一个输入参数，实际上输入是可以有多个的，如两个参数时写法：(a, b);
		 当然也可以没有输入，此时直接就可以是()。
		 函数体：->后面的部分，即被{}包围的部分；可以是一段代码。
		 输出：函数式编程可以没有返回值，也可以有返回值。如果有返回值时，需要代码段的最后一句通过return的方式返回对应的值。
		 */

		AbstractConsumer abstractConsumer = new AbstractConsumer() {
			/**
			 *
			 */
			@Override
			public void accept(Object o) {
				System.out.println(o);
			}
		};
		abstractConsumer.accept(8);
	}
}