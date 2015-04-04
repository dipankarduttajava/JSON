package com.gtfs.bean;

// Generated 30 Aug, 2014 4:24:58 PM by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * LicOblChecklist generated by hbm2java
 */
@Entity
@Table(name = "LIC_OBL_CHECKLIST", uniqueConstraints = @UniqueConstraint(columnNames = {
		"OBL_APPL_NO", "LIC_PRODUCT_VALUE_MST_ID", "PRNT_COMPY_ID" }))
public class LicOblChecklist implements java.io.Serializable {
	private Long id;
	private DesignationMst designationMst;
	private BranchMst branchMst;
	private LicProductValueMst licProductValueMst;
	private PhaseMst phaseMst;
	private String oblApplNo;
	private Date oblApplDate;
	private Long prntCompyId;
	private Long agCode;
	private String dobAgeFlag;
	private String panNoFlag;
	private String bankAccnoFlag;
	private String photoFlag;
	private String prpslSignedFlag;
	private String biFlag;
	private String properlyFilledFlag;
	private String ageFlag;
	private String loadFlag;
	private String idProofFlag;
	private String addrProofFlag;
	private String incomeProofFlag;
	private String cancelReason;
	private String fwdFlag;
	private Date fwdDate;
	private Long fwdBy;
	private Long secondedBy;
	private String approversComment;
	private String apprvRejectFlag;
	private Date apprvRejectDate;
	private String preDataEntryFlag;
	private Date insuredDob;
	private String insuredName;
	private String proposerName;
	private Date proposerDob;
	private String bnsDateOf;
	private Long createdBy;
	private Long modifiedBy;
	private Long deletedBy;
	private Date createdDate;
	private Date modifiedDate;
	private Date deletedDate;
	private String deleteFlag;
	private Set<LicOblApplicationMst> licOblApplicationMsts = new HashSet<LicOblApplicationMst>(0);

	public LicOblChecklist() {
	}

	public LicOblChecklist(Long id,
			LicProductValueMst licProductValueMst, String oblApplNo,
			Long prntCompyId) {
		this.id = id;
		this.licProductValueMst = licProductValueMst;
		this.oblApplNo = oblApplNo;
		this.prntCompyId = prntCompyId;
	}

	public LicOblChecklist(Long id, DesignationMst designationMst,
			BranchMst branchMst, LicProductValueMst licProductValueMst,
			PhaseMst phaseMst, String oblApplNo, Long prntCompyId,
			Long agCode, String dobAgeFlag, String panNoFlag,
			String bankAccnoFlag, String photoFlag, String prpslSignedFlag,
			String biFlag, String properlyFilledFlag, String ageFlag,
			String loadFlag, String idProofFlag, String addrProofFlag,
			String incomeProofFlag, String cancelReason, String fwdFlag,
			Date fwdDate, Long fwdBy, Long secondedBy,
			String approversComment, String apprvRejectFlag,
			Date apprvRejectDate, String preDataEntryFlag, Date insuredDob,
			String insuredName, String proposerName, Date proposerDob,
			Long createdBy, Long modifiedBy, Long deletedBy,
			Date createdDate, Date modifiedDate, Date deletedDate,
			String deleteFlag, Set<LicOblApplicationMst> licOblApplicationMsts) {
		this.id = id;
		this.designationMst = designationMst;
		this.branchMst = branchMst;
		this.licProductValueMst = licProductValueMst;
		this.phaseMst = phaseMst;
		this.oblApplNo = oblApplNo;
		this.prntCompyId = prntCompyId;
		this.agCode = agCode;
		this.dobAgeFlag = dobAgeFlag;
		this.panNoFlag = panNoFlag;
		this.bankAccnoFlag = bankAccnoFlag;
		this.photoFlag = photoFlag;
		this.prpslSignedFlag = prpslSignedFlag;
		this.biFlag = biFlag;
		this.properlyFilledFlag = properlyFilledFlag;
		this.ageFlag = ageFlag;
		this.loadFlag = loadFlag;
		this.idProofFlag = idProofFlag;
		this.addrProofFlag = addrProofFlag;
		this.incomeProofFlag = incomeProofFlag;
		this.cancelReason = cancelReason;
		this.fwdFlag = fwdFlag;
		this.fwdDate = fwdDate;
		this.fwdBy = fwdBy;
		this.secondedBy = secondedBy;
		this.approversComment = approversComment;
		this.apprvRejectFlag = apprvRejectFlag;
		this.apprvRejectDate = apprvRejectDate;
		this.preDataEntryFlag = preDataEntryFlag;
		this.insuredDob = insuredDob;
		this.insuredName = insuredName;
		this.proposerName = proposerName;
		this.proposerDob = proposerDob;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.deletedBy = deletedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.deletedDate = deletedDate;
		this.deleteFlag = deleteFlag;
		this.licOblApplicationMsts = licOblApplicationMsts;
	}

	
	@Id
	@SequenceGenerator(name="LIC_OBL_CHECKLIST_SEQ",sequenceName="LIC_OBL_CHECKLIST_SEQ")
	@GeneratedValue(generator="LIC_OBL_CHECKLIST_SEQ",strategy=GenerationType.AUTO)
	@Column(name = "ID",nullable = false, precision = 22, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DESIGNATION_MST_ID")
	public DesignationMst getDesignationMst() {
		return this.designationMst;
	}

	public void setDesignationMst(DesignationMst designationMst) {
		this.designationMst = designationMst;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BRANCH_MST_ID")
	public BranchMst getBranchMst() {
		return this.branchMst;
	}

	public void setBranchMst(BranchMst branchMst) {
		this.branchMst = branchMst;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIC_PRODUCT_VALUE_MST_ID", nullable = false)
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicProductValueMst getLicProductValueMst() {
		return this.licProductValueMst;
	}

	public void setLicProductValueMst(LicProductValueMst licProductValueMst) {
		this.licProductValueMst = licProductValueMst;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHASE_MST_ID")
	public PhaseMst getPhaseMst() {
		return this.phaseMst;
	}

	public void setPhaseMst(PhaseMst phaseMst) {
		this.phaseMst = phaseMst;
	}

	
	@Column(name = "OBL_APPL_NO", nullable = false, length = 15, unique=true)
	public String getOblApplNo() {
		return this.oblApplNo;
	}

	public void setOblApplNo(String oblApplNo) {
		this.oblApplNo = oblApplNo;
	}

	
	@Column(name = "PRNT_COMPY_ID", nullable = false, precision = 22, scale = 0)
	public Long getPrntCompyId() {
		return this.prntCompyId;
	}

	public void setPrntCompyId(Long prntCompyId) {
		this.prntCompyId = prntCompyId;
	}

	
	@Column(name = "AG_CODE", precision = 22, scale = 0)
	public Long getAgCode() {
		return this.agCode;
	}

	public void setAgCode(Long agCode) {
		this.agCode = agCode;
	}

	
	@Column(name = "DOB_AGE_FLAG", length = 1)
	public String getDobAgeFlag() {
		return this.dobAgeFlag;
	}

	public void setDobAgeFlag(String dobAgeFlag) {
		this.dobAgeFlag = dobAgeFlag;
	}

	
	@Column(name = "PAN_NO_FLAG", length = 1)
	public String getPanNoFlag() {
		return this.panNoFlag;
	}

	public void setPanNoFlag(String panNoFlag) {
		this.panNoFlag = panNoFlag;
	}

	
	@Column(name = "BANK_ACCNO_FLAG", length = 1)
	public String getBankAccnoFlag() {
		return this.bankAccnoFlag;
	}

	public void setBankAccnoFlag(String bankAccnoFlag) {
		this.bankAccnoFlag = bankAccnoFlag;
	}

	
	@Column(name = "PHOTO_FLAG", length = 1)
	public String getPhotoFlag() {
		return this.photoFlag;
	}

	public void setPhotoFlag(String photoFlag) {
		this.photoFlag = photoFlag;
	}

	
	@Column(name = "PRPSL_SIGNED_FLAG", length = 1)
	public String getPrpslSignedFlag() {
		return this.prpslSignedFlag;
	}

	public void setPrpslSignedFlag(String prpslSignedFlag) {
		this.prpslSignedFlag = prpslSignedFlag;
	}

	
	@Column(name = "BI_FLAG", length = 1)
	public String getBiFlag() {
		return this.biFlag;
	}

	public void setBiFlag(String biFlag) {
		this.biFlag = biFlag;
	}

	
	@Column(name = "PROPERLY_FILLED_FLAG", length = 1)
	public String getProperlyFilledFlag() {
		return this.properlyFilledFlag;
	}

	public void setProperlyFilledFlag(String properlyFilledFlag) {
		this.properlyFilledFlag = properlyFilledFlag;
	}

	
	@Column(name = "AGE_FLAG", length = 2)
	public String getAgeFlag() {
		return this.ageFlag;
	}

	public void setAgeFlag(String ageFlag) {
		this.ageFlag = ageFlag;
	}

	
	@Column(name = "LOAD_FLAG", length = 1)
	public String getLoadFlag() {
		return this.loadFlag;
	}

	public void setLoadFlag(String loadFlag) {
		this.loadFlag = loadFlag;
	}

	
	@Column(name = "ID_PROOF_FLAG", length = 1)
	public String getIdProofFlag() {
		return this.idProofFlag;
	}

	public void setIdProofFlag(String idProofFlag) {
		this.idProofFlag = idProofFlag;
	}

	
	@Column(name = "ADDR_PROOF_FLAG", length = 1)
	public String getAddrProofFlag() {
		return this.addrProofFlag;
	}

	public void setAddrProofFlag(String addrProofFlag) {
		this.addrProofFlag = addrProofFlag;
	}

	
	@Column(name = "INCOME_PROOF_FLAG", length = 1)
	public String getIncomeProofFlag() {
		return this.incomeProofFlag;
	}

	public void setIncomeProofFlag(String incomeProofFlag) {
		this.incomeProofFlag = incomeProofFlag;
	}

	
	@Column(name = "CANCEL_REASON", length = 50)
	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	
	@Column(name = "FWD_FLAG", length = 1)
	public String getFwdFlag() {
		return this.fwdFlag;
	}

	public void setFwdFlag(String fwdFlag) {
		this.fwdFlag = fwdFlag;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "FWD_DATE", length = 7)
	public Date getFwdDate() {
		return this.fwdDate;
	}

	public void setFwdDate(Date fwdDate) {
		this.fwdDate = fwdDate;
	}

	
	@Column(name = "FWD_BY", precision = 22, scale = 0)
	public Long getFwdBy() {
		return this.fwdBy;
	}

	public void setFwdBy(Long fwdBy) {
		this.fwdBy = fwdBy;
	}

	
	@Column(name = "SECONDED_BY", precision = 22, scale = 0)
	public Long getSecondedBy() {
		return this.secondedBy;
	}

	public void setSecondedBy(Long secondedBy) {
		this.secondedBy = secondedBy;
	}

	
	@Column(name = "APPROVERS_COMMENT", length = 50)
	public String getApproversComment() {
		return this.approversComment;
	}

	public void setApproversComment(String approversComment) {
		this.approversComment = approversComment;
	}

	
	@Column(name = "APPRV_REJECT_FLAG", length = 1)
	public String getApprvRejectFlag() {
		return this.apprvRejectFlag;
	}

	public void setApprvRejectFlag(String apprvRejectFlag) {
		this.apprvRejectFlag = apprvRejectFlag;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "APPRV_REJECT_DATE", length = 7)
	public Date getApprvRejectDate() {
		return this.apprvRejectDate;
	}

	public void setApprvRejectDate(Date apprvRejectDate) {
		this.apprvRejectDate = apprvRejectDate;
	}

	
	@Column(name = "PRE_DATA_ENTRY_FLAG", length = 1)
	public String getPreDataEntryFlag() {
		return this.preDataEntryFlag;
	}

	public void setPreDataEntryFlag(String preDataEntryFlag) {
		this.preDataEntryFlag = preDataEntryFlag;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "INSURED_DOB", length = 7)
	public Date getInsuredDob() {
		return this.insuredDob;
	}

	public void setInsuredDob(Date insuredDob) {
		this.insuredDob = insuredDob;
	}

	
	@Column(name = "INSURED_NAME", length = 50)
	public String getInsuredName() {
		return this.insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	
	@Column(name = "PROPOSER_NAME", length = 50)
	public String getProposerName() {
		return this.proposerName;
	}

	public void setProposerName(String proposerName) {
		this.proposerName = proposerName;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "PROPOSER_DOB", length = 7)
	public Date getProposerDob() {
		return this.proposerDob;
	}

	public void setProposerDob(Date proposerDob) {
		this.proposerDob = proposerDob;
	}

	
	@Column(name = "CREATED_BY", precision = 22, scale = 0)
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	
	@Column(name = "MODIFIED_BY", precision = 22, scale = 0)
	public Long getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	
	@Column(name = "DELETED_BY", precision = 22, scale = 0)
	public Long getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", length = 7)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_DATE", length = 7)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "DELETED_DATE", length = 7)
	public Date getDeletedDate() {
		return this.deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	
	@Column(name = "DELETE_FLAG", length = 1)
	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "licOblChecklist")
	public Set<LicOblApplicationMst> getLicOblApplicationMsts() {
		return this.licOblApplicationMsts;
	}

	public void setLicOblApplicationMsts(
			Set<LicOblApplicationMst> licOblApplicationMsts) {
		this.licOblApplicationMsts = licOblApplicationMsts;
	}
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "OBL_APPL_DATE", length = 7)
	public Date getOblApplDate() {
		return oblApplDate;
	}

	public void setOblApplDate(Date oblApplDate) {
		this.oblApplDate = oblApplDate;
	}
	@Column(name="BNS_DATE_OF",length=1)
	public String getBnsDateOf() {
		return bnsDateOf;
	}

	public void setBnsDateOf(String bnsDateOf) {
		this.bnsDateOf = bnsDateOf;
	}

}