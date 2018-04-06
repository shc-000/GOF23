/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.proxy.dynamic_proxy 
 * @author: shc   
 * @date: 2018年4月1日 下午12:27:08 
 */
package com.shc.proxy.dynamic_proxy;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: Test.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 下午12:27:08 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class Test {

	public static void main(String[] args) {
		//目标对象
		IUserDao targDao = new UserDao();
		//
		System.out.println(targDao.getClass());
		
		//给目标对象，创建代理对象
		IUserDao proxy = (IUserDao)new ProxyFactory(targDao).getProxyInstance();
		//class $Proxy0 内存中动态生成代理对象
		System.out.println(proxy.getClass());
		
		//执行方法  【代理对象】 
		proxy.save();
	}
}
