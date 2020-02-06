package design.pattern.chain.demo2;

/**
 * Created by 刘权 on 2020-2-6.
 */

import design.pattern.chain.demo2.handler.GateWayHandler;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        GateWayHandler firstGateWayHandler = GateWayHandlerFactory.getFirstGateWayHandler();
        firstGateWayHandler.service();
    }
}
