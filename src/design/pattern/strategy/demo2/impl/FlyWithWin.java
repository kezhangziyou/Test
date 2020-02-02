package design.pattern.strategy.demo2.impl;

import design.pattern.strategy.demo2.FlyStrategy;

/**
 * Created by 刘权 on 2020-2-2.
 */
public class FlyWithWin implements FlyStrategy {

    @Override
    public void performFly() {
        System.out.print("展翅高飞");

    }
}
