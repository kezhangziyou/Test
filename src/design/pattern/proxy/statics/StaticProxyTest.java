package design.pattern.proxy.statics;

/**
 * @author zhangke
 * @version 1.0
 * @className StaticProxyTest
 * @description TODO
 * @date 2019/2/20 上午11:26
 **/
public class StaticProxyTest {
    public static  void main(String [] args){
        RealManager realManager= new RealManager();
        //用代理类操作真实对象
        Manager manager= new RealMangerProxy(realManager);
        manager.run();
        RealMangerProxy1 realMangerProxy1= new RealMangerProxy1();
        realMangerProxy1.run();

    }
}