package design.pattern.chain.demo2;

import design.pattern.chain.demo2.handler.GateWayHandler;
import design.pattern.chain.demo2.responsibility.BlacklistHandler;
import design.pattern.chain.demo2.responsibility.ConversationHandler;
import design.pattern.chain.demo2.responsibility.CurrentLimitHandler;

/**
 * 工厂类
 */
public class GateWayHandlerFactory {

    public static GateWayHandler getFirstGateWayHandler(){
        //Api接口限流
        GateWayHandler currentLimitHandler = new CurrentLimitHandler();
        //黑名单拦截
        GateWayHandler blacklistHand = new BlacklistHandler();
        //会话拦击
        GateWayHandler conversationHandler = new ConversationHandler();
        currentLimitHandler.setGateWayHandler(blacklistHand);
        blacklistHand.setGateWayHandler(conversationHandler);
        return currentLimitHandler;
    }
}
