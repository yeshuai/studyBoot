package com.yyysh.study.boots.sys.vo;

import java.io.Serializable;

import javax.persistence.Table;

import com.yyysh.study.common.eneity.BaseEntity;

@Table(name="t_sys_role")
public class RoleVO extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//角色名称
	private String role_name;
	
	//角色代码
	private String role_code;
	
	//角色状态(0正常 1禁用）
	private String status;
	
	//角色类型
	private String role_type;
	
	//部门id
	private String baid;

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole_type() {
		return role_type;
	}

	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}

	public String getBaid() {
		return baid;
	}

	public void setBaid(String baid) {
		this.baid = baid;
	}
	
}
