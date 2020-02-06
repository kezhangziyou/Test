package design.pattern.chain.demo2.handler;

/**
 * 抽象角色
 */
public abstract class GateWayHandler {
    //下一个请求
    protected GateWayHandler nextGateWayHandler;

    public void setGateWayHandler(GateWayHandler gateWayHandler) {
        this.nextGateWayHandler = gateWayHandler;
    }

    /**
     * 处理业务
     */
    public abstract void service();

    /**
     * 得到下一个请求
     *
     * @return
     */
    public void getNextHand() {
        if (this.nextGateWayHandler != null) {
            nextGateWayHandler.service();
        }
    }
}






