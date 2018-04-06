/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.static_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午10:44:05 
 */
package com.shc.factory.abstract_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: Sender.java
 * @Description: 举一个发送邮件和短信的例子,Sender为二者（邮件，短信）的共同接口
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午10:44:05 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public interface Sender {
	void sendMsg();
}
