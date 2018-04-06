/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.static_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午10:46:09 
 */
package com.shc.factory.static_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: SmsSender.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午10:46:09 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class SmsSender implements Sender {

	/** 
	 * @see com.shc.factory.static_factory.Sender#sendMsg()  
	 * @Function: SmsSender.java
	 * @Description: 短信发送实现类
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午10:46:09 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2018年4月1日     shc           v1.0.0               修改原因
	 */
	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("发送短信");
	}

}
