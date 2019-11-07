package design.pattern.strategy.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className DiscountStrategy
 * @description 抽象类
 * @date 2019/11/7 3:19 PM
 **/

abstract public class DiscountStrategy {
	/**
	 * 书的价格
	 */
	private double price = 0;
	/**
	 * 书的数量
	 */
	private int copies = 0;

	public DiscountStrategy() {

	}

	/**
	 * 构造子,实现的客户端传入图书的单价,购买的册书,然后调用calculateDiscount方法得到折扣总额
	 */
	public DiscountStrategy(double price, int copies) {
		this.price = price;
		this.copies = copies;
	}


	/**
	 * 策略方法
	 */
	public abstract double calculateDiscount();


}