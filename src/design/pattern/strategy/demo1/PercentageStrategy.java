package design.pattern.strategy.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className PercentageStrategy
 * @description 算法3,百分比折扣
 * @date 2019/11/7 3:45 PM
 **/
public class PercentageStrategy extends DiscountStrategy{
	private double percent;
	private double price = 0;
	private int copies = 0;
	/**
	 *构造子
	 */
	public PercentageStrategy(double price, int copies){
		this.price = price;
		this.copies = copies;
	}

	public double getPercent(){
		return percent;
	}

	public void setPercent(double percent){
		this.percent = percent;

	}
	/**
	 *策略方法
	 */
	@Override
	public double calculateDiscount(){
		return copies * price * percent;

	}

	
}
		