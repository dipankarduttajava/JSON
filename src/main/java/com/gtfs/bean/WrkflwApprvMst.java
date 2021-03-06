package com.gtfs.bean;

// Generated 30 Aug, 2014 4:24:58 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * WrkflwApprvMst generated by hbm2java
 */
@Entity
@Table(name = "WRKFLW_APPRV_MST")
public class WrkflwApprvMst implements java.io.Serializable {

	private Long wrkflwId;
	private String processName;
	private String l1Desig;
	private String l2Desig;
	private String l3Desig;
	private String l4Desig;
	private String l5Desig;
	private String l6Desig;
	private String activeFlag;
	private String remarks;
	private Long userId;
	private Date dateTime;
	private Set<AgentMst> agentMsts = new HashSet<AgentMst>(0);

	public WrkflwApprvMst() {
	}

	public WrkflwApprvMst(Long wrkflwId) {
		this.wrkflwId = wrkflwId;
	}

	public WrkflwApprvMst(Long wrkflwId, String processName,
			String l1Desig, String l2Desig, String l3Desig, String l4Desig,
			String l5Desig, String l6Desig, String activeFlag, String remarks,
			Long userId, Date dateTime, Set<AgentMst> agentMsts) {
		this.wrkflwId = wrkflwId;
		this.processName = processName;
		this.l1Desig = l1Desig;
		this.l2Desig = l2Desig;
		this.l3Desig = l3Desig;
		this.l4Desig = l4Desig;
		this.l5Desig = l5Desig;
		this.l6Desig = l6Desig;
		this.activeFlag = activeFlag;
		this.remarks = remarks;
		this.userId = userId;
		this.dateTime = dateTime;
		this.agentMsts = agentMsts;
	}

	@Id
	@Column(name = "WRKFLW_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getWrkflwId() {
		return this.wrkflwId;
	}

	public void setWrkflwId(Long wrkflwId) {
		this.wrkflwId = wrkflwId;
	}

	@Column(name = "PROCESS_NAME", length = 3)
	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	@Column(name = "L1_DESIG", length = 3)
	public String getL1Desig() {
		return this.l1Desig;
	}

	public void setL1Desig(String l1Desig) {
		this.l1Desig = l1Desig;
	}

	@Column(name = "L2_DESIG", length = 3)
	public String getL2Desig() {
		return this.l2Desig;
	}

	public void setL2Desig(String l2Desig) {
		this.l2Desig = l2Desig;
	}

	@Column(name = "L3_DESIG", length = 3)
	public String getL3Desig() {
		return this.l3Desig;
	}

	public void setL3Desig(String l3Desig) {
		this.l3Desig = l3Desig;
	}

	@Column(name = "L4_DESIG", length = 3)
	public String getL4Desig() {
		return this.l4Desig;
	}

	public void setL4Desig(String l4Desig) {
		this.l4Desig = l4Desig;
	}

	@Column(name = "L5_DESIG", length = 3)
	public String getL5Desig() {
		return this.l5Desig;
	}

	public void setL5Desig(String l5Desig) {
		this.l5Desig = l5Desig;
	}

	@Column(name = "L6_DESIG", length = 3)
	public String getL6Desig() {
		return this.l6Desig;
	}

	public void setL6Desig(String l6Desig) {
		this.l6Desig = l6Desig;
	}

	@Column(name = "ACTIVE_FLAG", length = 1)
	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "REMARKS", length = 50)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "USER_ID", precision = 22, scale = 0)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "DATE_TIME")
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "wrkflwApprvMst")
	public Set<AgentMst> getAgentMsts() {
		return this.agentMsts;
	}

	public void setAgentMsts(Set<AgentMst> agentMsts) {
		this.agentMsts = agentMsts;
	}

}
