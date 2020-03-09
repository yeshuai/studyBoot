package com.yyysh.study.boots.sys.service;

import java.util.List;
import java.util.Map;

import com.yyysh.study.boots.sys.vo.UserVO;

/**
 * 
* @ClassName: UserService 
* @Description: 系统用户表接口
* @author Austin YE
* @date 2020年3月3日 上午10:14:31 
*
 */
public interface UserService {
	
	UserVO queryObject(String id);
	
	List<UserVO> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserVO user);
	
	void update(UserVO user);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

	/**
	 * 根据登陆用户查询有效的用户
	 * @param logName
	 * @return
	 */
	UserVO queryByLoginName(String logName);

	/**
	 * 用户对应的机构id,数据权限控制
	 * @param userId
	 * @return key:roleId 角色id value:角色所对应的机构集合
	 */
	Map<String,List<String>> queryBapidByUserId(String userId);

	/**
	 * 用户对应的机构id,数据权限控制
	 * @param userId
	 */
	List<String> queryBapidByUserIdArray(String userId);


	/**
	 * 用户对应的部门id,数据权限控制
	 * @param userId
	 * @return key:roleId 角色id value:角色所对应的部门集合
	 */
	Map<String,List<String>> queryBaidByUserId(String userId);

	/**
	 * 用户对应的部门id,数据权限控制
	 * @param userId
	 */
	List<String> queryBaidByUserIdArray(String userId);


	/**
	 * 修改密码
	 * @param user
	 * @return
	 */
	int updatePassword (UserVO user);

	/**
	 * 批量更新角色状态
	 * @param status 状态(0正常 -1禁用)
	 * @return
	 */
	int updateBatchStatus(String[] ids,String status);

	/**
	 * 重置密码
	 * @param ids
	 * @return
	 */
	int resetPassWord(String[] ids);

}
