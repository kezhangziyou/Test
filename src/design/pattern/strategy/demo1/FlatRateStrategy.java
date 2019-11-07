package design.pattern.strategy.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className FlatRateStrategy
 * @description 算法2,固定折扣为1元
 * @date 2019/11/7 3:37 PM
 **/
public class FlatRateStrategy extends DiscountStrategy {

	private double price = 0;

	private int copies = 0;
	/**
	 * 固定折扣
	 */
	private double amount;

	/**
	 * 构造子
	 */
	public FlatRateStrategy(double price, int copies) {
		this.price = price;
		this.copies = copies;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * 策略方法
	 */
	@Override
	public double calculateDiscount() {
		return copies * amount;
	}

}