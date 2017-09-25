package cs.test.entity;

import java.sql.Timestamp;

/**
 * 系统-用户 

 * 
 * @author xfzhou
 */
public class SysUser  {
	private static final long serialVersionUID = -7891572429303491389L;

	private Integer userId;
	private String loginName;
	private String passWord;
	private String name;
	private String gender;
	private String headImg;
	private String companyCode;
	private String company;
	private String departmentCode;
	private String department;
	private Integer enteId;
	private String roomCode;
	private Integer isAdmin;// 是否管理员（管理员不受权限控制）
	private Integer userSort;
	private Integer isLock;// 是否锁定（登录时密码尝试多次时锁定）
	private Integer isUse;// 是否禁用
	private String duty;//职务
	private String jobTitle;//职称
	private String movePhone;
	private String movePhone2;
	private String officePhone;
	private String homePhone;
	private String fax;
	private String email;
	private String qq;
	private String weiXin;
	private String instantMessage;
	private String instantMessagePass;
	private String homePage;
	private String messageAddress;
	private String remark;
	private Timestamp lastLoginTime;
	private Integer version;
	private Integer createUserId;
	private String createUserName;
	private Timestamp createTime;
	private Integer updateUserId;
	private String updateUserName;
	private Timestamp updateTime;


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getMovePhone() {
		return movePhone;
	}

	public void setMovePhone(String movePhone) {
		this.movePhone = movePhone;
	}
	
	public String getMovePhone2() {
		return movePhone2;
	}

	public void setMovePhone2(String movePhone2) {
		this.movePhone2 = movePhone2;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeiXin() {
		return weiXin;
	}

	public void setWeiXin(String weiXin) {
		this.weiXin = weiXin;
	}

	public String getInstantMessage() {
		return instantMessage;
	}

	public void setInstantMessage(String instantMessage) {
		this.instantMessage = instantMessage;
	}

	public String getInstantMessagePass() {
		return instantMessagePass;
	}

	public void setInstantMessagePass(String instantMessagePass) {
		this.instantMessagePass = instantMessagePass;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getMessageAddress() {
		return this.messageAddress;
	}

	public void setMessageAddress(String messageAddress) {
		this.messageAddress = messageAddress;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getUserSort() {
		return userSort;
	}

	public void setUserSort(Integer userSort) {
		this.userSort = userSort;
	}

	public Integer getIsUse() {
		return isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getEnteId() {
		return enteId;
	}

	public void setEnteId(Integer enteId) {
		this.enteId = enteId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * sysUser作为map  key 用到equals和hashCode
	 * 
	 * @author CS
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	/**
	 * sysUser作为map  key 用到equals和hashCode
	 * 
	 * @author CS
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysUser other = (SysUser) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}



}
