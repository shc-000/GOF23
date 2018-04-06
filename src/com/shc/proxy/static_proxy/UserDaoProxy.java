/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.proxy.static_proxy 
 * @author: shc   
 * @date: 2018年4月1日 上午11:54:30 
 */
package com.shc.proxy.static_proxy;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: UserDaoProxy.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午11:54:30 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class UserDaoProxy implements IUserDao {

	//接收保存目标对象
	private IUserDao target;
	
	/**   
	 * @Function: UserDaoProxy.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:参数描述
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午11:56:15 
	 */
	public UserDaoProxy(IUserDao target) {
		this.target = target;
	}
	//public UserDaoProxy(){}
	/** 
	 * @see com.shc.proxy.static_proxy.IUserDao#save()  
	 * @Function: UserDaoProxy.java
	 * @Description: 代理对象，静态代理
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午11:54:30 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2018年4月1日     shc           v1.0.0               修改原因
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("开始事务。。。");
		target.save();//执行目标对象的方法
		System.out.println("提交事务。。。");
	}

}
