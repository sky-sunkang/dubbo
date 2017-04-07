package com.sunkang.entity;

import java.util.Arrays;
import java.util.Date;

import com.sunkang.common.entity.BaseEntity;
/**
 * @ClassName: User 
 * @Description: 用户实体
 * @author: sunkang
 * @date: 2017-3-30 下午3:11:13
 */
public class User extends BaseEntity{
    private String id;
    private Integer version;
    private Date createTime;
    private String userNo;
    private String userType;
    private Long mainUserId;
    private String userPwd;
    private String userName;
    private String mobileNo;
    private Integer status;
    private Date lastLoginTime;
    private Integer isChangedPwd;
    private Integer pwdErrorCount;
    private Date pwdErrorTime;
    private String remark;
    private byte[] email;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Long getMainUserId() {
        return mainUserId;
    }

    public void setMainUserId(Long mainUserId) {
        this.mainUserId = mainUserId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getIsChangedPwd() {
        return isChangedPwd;
    }

    public void setIsChangedPwd(Integer isChangedPwd) {
        this.isChangedPwd = isChangedPwd;
    }

    public Integer getPwdErrorCount() {
        return pwdErrorCount;
    }

    public void setPwdErrorCount(Integer pwdErrorCount) {
        this.pwdErrorCount = pwdErrorCount;
    }

    public Date getPwdErrorTime() {
        return pwdErrorTime;
    }

    public void setPwdErrorTime(Date pwdErrorTime) {
        this.pwdErrorTime = pwdErrorTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public byte[] getEmail() {
        return email;
    }

    public void setEmail(byte[] email) {
        this.email = email;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", version=" + version + ", createTime="
				+ createTime + ", userNo=" + userNo + ", userType=" + userType
				+ ", mainUserId=" + mainUserId + ", userPwd=" + userPwd
				+ ", userName=" + userName + ", mobileNo=" + mobileNo
				+ ", status=" + status + ", lastLoginTime=" + lastLoginTime
				+ ", isChangedPwd=" + isChangedPwd + ", pwdErrorCount="
				+ pwdErrorCount + ", pwdErrorTime=" + pwdErrorTime
				+ ", remark=" + remark + ", email=" + Arrays.toString(email)
				+ "]";
	}
    
    
}