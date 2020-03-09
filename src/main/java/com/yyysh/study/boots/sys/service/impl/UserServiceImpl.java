package com.yyysh.study.boots.sys.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyysh.study.boots.sys.service.UserService;
import com.yyysh.study.boots.sys.vo.UserVO;

import java.util.*;


@Service("userService")
public class UserServiceImpl implements UserService {

	
	
	
	@Override
	public UserVO queryObject(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserVO> queryList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void save(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatch(String[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO queryByLoginName(String logName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<String>> queryBapidByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> queryBapidByUserIdArray(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<String>> queryBaidByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> queryBaidByUserIdArray(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePassword(UserVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatchStatus(String[] ids, String status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int resetPassWord(String[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
