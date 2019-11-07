package design.pattern.strategy.demo1;

/**
 * @author zhangke
 * @version 1.0
 * @className testDemo
 * @description
 * @date 2019/11/7 4:02 PM
 **/
public class testDemo {
	public static  void main(String [] args){
		NoDiscountStrategy noDiscountStrategy = new NoDiscountStrategy(10,10);

		System.out.println(10*10-noDiscountStrategy.calculateDiscount());

		FlatRateStrategy flatRateStrategy = new FlatRateStrategy(20,2);
		flatRateStrategy.setAmount(1);
		System.out.println(20*2-flatRateStrategy.calculateDiscount());
		PercentageStrategy percentageStrategy = new PercentageStrategy(100,3);
		percentageStrategy.setPercent(0.2);
		System.out.println(100*3-percentageStrategy.calculateDiscount());
	}
}