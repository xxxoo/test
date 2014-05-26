package com.company.section5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 子类
 */
public class Son extends Father {

	//缩小输入参数范围
	public Collection doSomething(HashMap map){
		System.out.println("子类被执行...");
		return map.values();
	}
	
	//放大输入参数类型
	@Override
	protected Collection doSomething(Map map){
		System.out.println("子类被执行haha.........................");
		return map.values();
	}
	
//	public String doSomething(Map map){
//		System.out.println("子类被执行haha.........................");
//		return map.values();
//	}
	
}
