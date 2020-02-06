package design.pattern.chain.demo1;

import design.pattern.chain.demo1.handler.PriceHandler;

import java.util.Random;


/*
 * 客户，请求折扣
 */
public class Customer {
	/**
	 * 价格处理人
	 */
	private PriceHandler priceHandler;

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	/**
	 * 客户申请折扣，通过价格处理人来处理折扣
	 * @param discount
	 */
	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}


	public static void main(String[] args){
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

		Random rand = new Random();

		for(int i=1;i<=100;i++){
			System.out.print(i+":");
			customer.requestDiscount(rand.nextFloat());
		}


	}


}
