package jdk.design.pattern.predicate;
/**
 * @author zhangke
 * @description //TODO  定义过滤方法，将过滤接口当做参数传入，这样这个过滤方法就不用修改，在实际调用的时候将具体的实现类传入即可。
 * @date  2019/5/16
 * @return 
 **/

public interface MyPredicate <T> {
    boolean test(T t);
}