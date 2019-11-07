package design.pattern.strategy.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className NoDiscountStrategy
 * @description 算法1,无折扣
 * @date 2019/11/7 3:26 PM
 **/
public class NoDiscountStrategy extends DiscountStrategy {

	private double price = 0;
	private int copies = 0;


	/**
	 * 构轮子
	 */

	public NoDiscountStrategy(double price, int copies) {
		this.price = price;
		this.copies = copies;
	}

	/**
	 * 策略方法
	 */
	@Override
	public double calculateDiscount() {
		return 0;
	}


}