/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.static_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午10:49:52 
 */
package com.shc.factory.static_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: SendFactory.java
 * @Description: 消息发送实现类的工厂
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午10:49:52 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class SendFactory {

	/**   
	 * @Function: SendFactory.java
	 * @Description: 创建邮件发送实现类
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午10:51:17 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2018年4月1日     shc           v1.0.0               修改原因
	 */
	public static MailSender createMailSender() {
		
		return new MailSender();
	}
	
	/**   
	 * @Function: SendFactory.java
	 * @Description: 创建短信发送实现类
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: shc
	 * @date: 2018年4月1日 上午10:51:59 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2018年4月1日     shc           v1.0.0               修改原因
	 */
	public static SmsSender createSmsSender() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
}
