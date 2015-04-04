package com.gtfs.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class BranchMstDto implements Serializable {
	
	private static final long serialVersionUID = -7788619177798333712L;
	
	private Long branchId;
	private Long divisionMstByPrntDivIdBns;
	private Long divisionMstByPrntDivIdOps;
	private Long stateMst;
	private String branchName;
	private String branchAbbr;
	private String branchCode;
	private String addr1;
	private String addr2;
	private String addr3;
	private String city;
	private Long pin;
	private String phone;
	private String mobile;
	private String email;
	private String activeFlag;
	private Long trnfLocation;
	private String remarks;
	private Long userId;
	@JsonSerialize(using=DateSerializer.class)
	private Date dateTime;
	private String licHubType;
	
	
	public Long getBranchId() {
		return branchId;
	}
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}
	public Long getDivisionMstByPrntDivIdBns() {
		return divisionMstByPrntDivIdBns;
	}
	public void setDivisionMstByPrntDivIdBns(Long divisionMstByPrntDivIdBns) {
		this.divisionMstByPrntDivIdBns = divisionMstByPrntDivIdBns;
	}
	public Long getDivisionMstByPrntDivIdOps() {
		return divisionMstByPrntDivIdOps;
	}
	public void setDivisionMstByPrntDivIdOps(Long divisionMstByPrntDivIdOps) {
		this.divisionMstByPrntDivIdOps = divisionMstByPrntDivIdOps;
	}
	public Long getStateMst() {
		return stateMst;
	}
	public void setStateMst(Long stateMst) {
		this.stateMst = stateMst;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAbbr() {
		return branchAbbr;
	}
	public void setBranchAbbr(String branchAbbr) {
		this.branchAbbr = branchAbbr;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPin() {
		return pin;
	}
	public void setPin(Long pin) {
		this.pin = pin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Long getTrnfLocation() {
		return trnfLocation;
	}
	public void setTrnfLocation(Long trnfLocation) {
		this.trnfLocation = trnfLocation;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getLicHubType() {
		return licHubType;
	}
	public void setLicHubType(String licHubType) {
		this.licHubType = licHubType;
	}
	
	
	
	
}
