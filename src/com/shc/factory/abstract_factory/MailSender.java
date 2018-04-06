/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.static_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午10:46:57 
 */
package com.shc.factory.abstract_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: MailSender.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午10:46:57 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class MailSender implements Sender {

	/** 
	 * @see com.shc.factory.static_factory.Sender#sendMsg()  
	 * @Function: MailSender.java
	 * @Description: 邮件发送实现类
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午10:46:57 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2018年4月1日     shc           v1.0.0               修改原因
	 */
	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("发送邮件");
	}

}
