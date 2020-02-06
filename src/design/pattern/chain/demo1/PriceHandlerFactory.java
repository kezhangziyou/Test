package design.pattern.chain.demo1;

import design.pattern.chain.demo1.handler.PriceHandler;
import design.pattern.chain.demo1.responsibility.*;

/**
 * 责任链的工厂方法
 */
public class PriceHandlerFactory {

	/*
	 * 创建PriceHandler的工厂方法
	 */
	public static PriceHandler createPriceHandler() {

		PriceHandler sales = new Sales();
		PriceHandler lead = new Lead();
		PriceHandler man = new Manager();
		PriceHandler dir = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		//创建责任链
		sales.setSuccessor(lead);
		lead.setSuccessor(man);
		man.setSuccessor(dir);
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);

		return sales;
	}

}
