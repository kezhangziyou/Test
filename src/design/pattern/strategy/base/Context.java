package design.pattern.strategy.base;

/**
 * @author zhangke
 * @version 1.0
 * @className Context
 * @description ﻿环境(Context) 角色:持有一个Strategy类的引用。
 * @date 2019/11/7 2:56 PM
 **/
public class Context {
	private  Strategy strategy;

	public  void contextInterface(){
		strategy.strategyInterface();
	}
}