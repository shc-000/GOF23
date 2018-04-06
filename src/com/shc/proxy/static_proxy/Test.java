/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.proxy.static_proxy 
 * @author: shc   
 * @date: 2018年4月1日 上午11:59:07 
 */
package com.shc.proxy.static_proxy;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: Test.java
 * @Description: 测试类
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午11:59:07 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class Test {

	public static void main(String[] args) {
		//目标对象
		UserDao target = new UserDao();
		
		//代理对象，把目标对象传给代理对象，建立代理关系
		UserDaoProxy proxy = new UserDaoProxy(target);
		
		proxy.save();//执行的是代理的方法
	}
}
