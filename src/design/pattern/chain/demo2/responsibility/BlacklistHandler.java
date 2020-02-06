package design.pattern.chain.demo2.responsibility;

import design.pattern.chain.demo2.handler.GateWayHandler;

/**
 * 黑名单实现
 */
public class BlacklistHandler extends GateWayHandler {
    @Override
    public void service() {
        System.out.println("第二关黑名单拦截");
        //处理下一个请求
        getNextHand();
    }
}
