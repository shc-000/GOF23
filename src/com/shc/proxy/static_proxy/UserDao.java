/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.proxy.static_proxy 
 * @author: shc   
 * @date: 2018年4月1日 上午11:52:55 
 */
package com.shc.proxy.static_proxy;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: UserDao.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午11:52:55 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class UserDao implements IUserDao {

	/** 
	 * @see com.shc.proxy.static_proxy.IUserDao#save()  
	 * @Function: UserDao.java
	 * @Description: 目标对象
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午11:52:55 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2018年4月1日     shc           v1.0.0               修改原因
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("--已经保存数据--");
	}

}
