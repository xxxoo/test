package com.company.section5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����
 */
public class Son extends Father {

	//��С���������Χ
	public Collection doSomething(HashMap map){
		System.out.println("���౻ִ��...");
		return map.values();
	}
	
	//�Ŵ������������
	@Override
	protected Collection doSomething(Map map){
		System.out.println("���౻ִ��haha.........................");
		return map.values();
	}
	
//	public String doSomething(Map map){
//		System.out.println("���౻ִ��haha.........................");
//		return map.values();
//	}
	
}
