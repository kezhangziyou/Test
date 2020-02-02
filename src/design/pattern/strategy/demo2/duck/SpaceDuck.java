package design.pattern.strategy.demo2.duck;

import design.pattern.strategy.demo2.Duck;
import design.pattern.strategy.demo2.impl.FlyWithRocket;

/**
 * Created by 刘权 on 2020-2-2.
 */
public class SpaceDuck extends Duck {

    public SpaceDuck() {
        super();
        super.setFlyStrategy(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.print("我的是太空鸭");

    }
}
