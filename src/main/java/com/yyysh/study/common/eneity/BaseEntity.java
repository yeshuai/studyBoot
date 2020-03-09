package com.yyysh.study.common.eneity;

import java.util.Date;

import javax.persistence.Id;

/**
 * 
* @ClassName: BaseEntity 
* @Description: 业务实体公共基类
* @author Austin YE
* @date 2020年3月3日 上午10:13:49 
*
 */
public class BaseEntity {

	//id主键
	@Id
	private String id;
	
    /**
      * 新增人
     */
    private String createId;
    /**
      * 修改者
     */
    private String updateId;
    /**
        * 备注
     */
    private String remark;
    /**
      * 新增时间
     */
    private Date createTime;
    /**
            * 更新时间
     */
    private Date updateTime;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	public String getUpdateId() {
		return updateId;
	}
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
    
}
