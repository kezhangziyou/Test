package design.pattern.chain.demo2.responsibility;

/**
 * Created by 刘权 on 2020-2-6.
 */

import design.pattern.chain.demo2.handler.GateWayHandler;

/**
 * 会话拦击
 */
public class ConversationHandler extends GateWayHandler {
    @Override
    public void service() {
        System.out.println("第三关会话拦截判断");
        //处理下一个请求
        getNextHand();
    }
}