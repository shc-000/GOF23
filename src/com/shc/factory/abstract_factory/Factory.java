/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * 功能描述：
 * @Package: com.shc.factory.abstract_factory 
 * @author: shc   
 * @date: 2018年4月1日 上午11:03:53 
 */
package com.shc.factory.abstract_factory;

/**   
 * Copyright: Copyright (c) 2018 公司
 * 
 * @ClassName: Factory.java
 * @Description: 根据分类创建多个工厂，每个工厂分管一个产品线
 *
 * @version: v1.0.0
 * @author: shc
 * @date: 2018年4月1日 上午11:03:53 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018年4月1日     shc           v1.0.0               修改原因
 */
public interface Factory {
	Sender produce();
}
