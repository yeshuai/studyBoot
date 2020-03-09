package com.yyysh.study.common.eneity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;

import com.yyysh.study.boots.sys.vo.UserVO;

/**
 * 
* @ClassName: BaseController 
* @Description: 公共控制器
* @author Austin YE
* @date 2020年3月3日 下午6:17:57 
*
 */
public abstract class BaseController {
	
	// 控制器本来就是单例，这样似乎更加合理
    protected Logger logger = LogManager.getLogger(getClass());
	
	/**
	 * 
	* @Title: getShiroUser 
	* @Description: 获取当前登录对象
	* @param @return    设定文件 
	* @return UserVO    返回类型 
	* @author Austin YE
	* @date 2020年3月7日 下午2:53:39 
	* @throws
	 */
	public UserVO getShiroUser() {
		return (UserVO) SecurityUtils.getSubject().getPrincipal();
	}
	
	/**
	 * 
	* @Title: getLoginName 
	* @Description: 获取当前用户名称
	* @param @return    设定文件 
	* @return String    返回类型 
	* @author Austin YE
	* @date 2020年3月9日 下午2:55:13 
	* @throws
	 */
	public String getLoginName() {
		return this.getShiroUser().getLoginName();
	}

	//消息成功 ok 及对象
	//消息失败 error 及对象
	
	//分页 
	
	//文件上传下载
	
	
}
