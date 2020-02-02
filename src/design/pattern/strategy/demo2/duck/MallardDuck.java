package design.pattern.strategy.demo2.duck;

import design.pattern.strategy.demo2.Duck;
import design.pattern.strategy.demo2.impl.FlyWithWin;

/**
 * Created by 刘权 on 2020-2-2.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        super.setFlyStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.print("我的脖子是绿色的");

    }
}
