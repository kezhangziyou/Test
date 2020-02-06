package design.pattern.chain.demo1.responsibility;


import design.pattern.chain.demo1.handler.PriceHandler;

/*
 * 销售副总裁， 可以批准50%以内的折扣
 */
public class VicePresident extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount<=0.5){
			System.out.format("%s批准了折扣:%.2f%n",this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}

	}

}
