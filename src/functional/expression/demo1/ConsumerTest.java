package functional.expression.demo1;

import java.util.function.Consumer;

/**
 * @author zhangke
 * @version 1.0
 * @className ConsumerTest
 * @description
 * @date 2019/11/1 11:47 AM
 **/
public class ConsumerTest {
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
		Consumer consumer2 = (o) -> {
			System.out.println(o);
		};
		consumer2.accept(2222);
		//特殊情况,当函数体中只有一个语句时，可以去掉{}进一步简化：
		Consumer consumer3 = (o) -> System.out.println(o);
		//由于此处只是进行打印，调用了System.out中的println静态方法对输入参数直接进行打印，
		Consumer consumer4 = System.out::println;

		//总结;
		/**
		 * 通过最后一段代码，我们可以简单的理解函数式编程，Consumer接口直接就可以当成一个函数了，这个函数接收一个输入参数，
		 * 然后针对这个输入进行处理；当然其本质上仍旧是一个对象，但我们已经省去了诸如老方式中的对象定义过程，直接使用一段代
		 * 码来给函数式接口对象赋值。
		 而且最为关键的是，这个函数式对象因为本质上仍旧是一个对象，因此可以做为其它方法的参数或者返回值，可以与原有的代码实现无缝集成！
		 */


	}
}