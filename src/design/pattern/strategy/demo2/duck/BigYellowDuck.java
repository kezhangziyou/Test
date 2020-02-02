package design.pattern.strategy.demo2.duck;

import design.pattern.strategy.demo2.Duck;
import design.pattern.strategy.demo2.impl.FlyNoWay;

/**
 * Created by 刘权 on 2020-2-2.
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        super();
        super.setFlyStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.print("我是大黄鸭");

    }
}
