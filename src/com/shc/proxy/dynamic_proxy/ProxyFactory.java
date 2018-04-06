/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.proxy.dynamic_proxy 
 * @author: shc   
 * @date: 2018年4月1日 下午12:15:44 
 */
package com.shc.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: ProxyFactory.java
 * @Description: 代理工厂类
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 下午12:15:44 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class ProxyFactory {
	
	//维护一个目标对象
	private Object target;
	public ProxyFactory(Object target){
		this.target = target;
	}
	//给目标对象生成代理对象
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("开始事务2");
						//执行目标对象方法
						Object returnValue = method.invoke(target, args);
						System.out.println("提交事务2");
						return returnValue;
					}
				});
	}
}
