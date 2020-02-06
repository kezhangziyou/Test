package design.pattern.chain.demo2.responsibility;

/**
 * Created by 刘权 on 2020-2-6.
 */

import design.pattern.chain.demo2.handler.GateWayHandler;

/**
 * Api接口限流
 */
public class CurrentLimitHandler extends GateWayHandler {

    @Override
    public void service() {
        System.out.println("第一关网关限流操作");
        //处理下一个请求
        getNextHand();
    }
}
