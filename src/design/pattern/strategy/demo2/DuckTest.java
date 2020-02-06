package design.pattern.strategy.demo2;

import design.pattern.strategy.base.Strategy;
import design.pattern.strategy.demo2.duck.MallardDuck;

/**
 * Created by 刘权 on 2020-2-2.
 */
public class DuckTest {
    public static  void main(String [] args){
        System.out.print("测试开始");

        Duck duck=null;
        duck =new MallardDuck();
//        duck =new RedHeadDuck();
//        duck =new BigYellowDuck();
//        duck =new SpaceDuck();
        duck.display();
        duck.quack();
        duck.fly();
        System.out.print("测试结束");

    }

}
