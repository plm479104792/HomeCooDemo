package com.homecoo.smarthome.domain;


public class AppVersion {
	private String phoneNum;
	private String gatewayNo;
	private Integer versionType;
	private String versionCode;
	private String versionDescription;
	private long updateTime;
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getGatewayNo() {
		return gatewayNo;
	}
	public void setGatewayNo(String gatewayNo) {
		this.gatewayNo = gatewayNo;
	}
	public Integer getVersionType() {
		return versionType;
	}
	public void setVersionType(Integer versionType) {
		this.versionType = versionType;
	}
	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionDescription() {
		return versionDescription;
	}
	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}
	
	public long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "AppVersion [phoneNum=" + phoneNum + ", gatewayNo=" + gatewayNo
				+ ", versionType=" + versionType + ", versionCode="
				+ versionCode + ", versionDescription=" + versionDescription
				+ ", updateTime=" + updateTime + "]";
	}
}
