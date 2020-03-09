package com.yyysh.study.boots.sys.dao;

import java.util.List;
import java.util.Map;

import com.yyysh.study.boots.sys.vo.UserVO;
import com.yyysh.study.common.eneity.BaseDao;


/**
 * 
* @ClassName: UserDao 
* @Description: 系统用户表
* @author Austin YE
* @date 2020年3月3日 下午6:13:15 
*
 */
public interface UserDao extends BaseDao<UserVO> {
	
	/**
	 * 
	* @Title: queryByUserName 
	* @Description: 根据当前用户查询有效的用户
	* @param  userId
	* @return UserVO    返回类型 
	* @author Austin YE
	* @date 2020年3月3日 下午6:14:39 
	* @throws
	 */
	UserVO queryByUserName(String userId);

	/**
     * 用户对应的机构id,数据权限控制
     * @param userId
     * @param type 结点类型：0=根节点 ，1=机构，2=部门 具体见:Constant 类
     * @return key:organId 组织id key:roleId 角色id
     */
    List<Map<String,Object>> queryOrganIdByUserId(String userId, String type);
	
    /**
     * 用户对应的机构id,数据权限控制
     * @param userId
     * @param type 结点类型：0=根节点 ，1=机构，2=部门 具体见:Constant 类
     */
    List<String> queryOrganIdByUserIdArray(String userId, String type);
    
}
