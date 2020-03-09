package com.yyysh.study.common.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.yyysh.study.boots.sys.service.UserService;
import com.yyysh.study.boots.sys.vo.UserVO;

/**
 * 
* @ClassName: UserUtils 
* @Description: 用户工具类
* @author Austin YE
* @date 2020年3月3日 上午10:01:28 
*
 */
public class UserUtils {
	
	@Autowired
    private UserService userService;
	
    /**
     * 获取当前登陆用户
     * @return
     */
    public static UserVO getCurrentUser(){
        UserVO user = ShiroUtils.getUserEntity();
        return user;
    }
	
}
