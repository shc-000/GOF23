/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.abstract_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午11:09:40 
 */
package com.shc.factory.abstract_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: SmsSendFactory.java
 * @Description: 短信工厂
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午11:09:40 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public class SmsSendFactory implements Factory {

	/** 
	* @see com.shc.factory.abstract_factory.Factory#produce()  
	* @Function: SmsSendFactory.java
	* @Description: 
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: shc
	 * @return 
	* @date: 2018年4月1日 上午11:09:54 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年4月1日     shc           v1.0.0               修改原因
	*/
	@Override
	public SmsSender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
