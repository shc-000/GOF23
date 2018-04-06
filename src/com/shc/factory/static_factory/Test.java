/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.static_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午10:56:59 
 */
package com.shc.factory.static_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: Test.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午10:56:59 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class Test {
	public static void main(String[] args) {
		MailSender mailSend = SendFactory.createMailSender();
		mailSend.sendMsg();
		SmsSender smsSend = SendFactory.createSmsSender();
		smsSend.sendMsg();
	}
}
