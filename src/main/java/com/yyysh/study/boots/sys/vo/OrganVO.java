package com.yyysh.study.boots.sys.vo;

import java.io.Serializable;

import javax.persistence.Table;

import com.yyysh.study.common.eneity.BaseEntity;


@Table(name="t_sys_organ")
public class OrganVO extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//结点类型：0=根节点 ，1=机构，2=部门
	private String organ_type;
	//编号
	private String organ_code;
	//节点的名字
	private String organ_name;
	//节点的父节点
	private String parent_id;
	//是否删除 
	private String is_del;
	//系统标识
	private String sysmark;
	//在同一级节点中的序号
	private String sort;
	//是否展开
	private String open;
	
	
	
	public String getOrgan_type() {
		return organ_type;
	}
	public void setOrgan_type(String organ_type) {
		this.organ_type = organ_type;
	}
	public String getOrgan_code() {
		return organ_code;
	}
	public void setOrgan_code(String organ_code) {
		this.organ_code = organ_code;
	}
	public String getOrgan_name() {
		return organ_name;
	}
	public void setOrgan_name(String organ_name) {
		this.organ_name = organ_name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getIs_del() {
		return is_del;
	}
	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}
	public String getSysmark() {
		return sysmark;
	}
	public void setSysmark(String sysmark) {
		this.sysmark = sysmark;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	
}
