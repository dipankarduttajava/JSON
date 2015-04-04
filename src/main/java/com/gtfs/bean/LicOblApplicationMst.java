package com.gtfs.bean;

// Generated 30 Aug, 2014 4:24:58 PM by Hibernate Tools 3.4.0.CR1


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * LicOblApplicationMst generated by hbm2java
 */
@Entity
@Table(name = "LIC_OBL_APPLICATION_MST")
public class LicOblApplicationMst implements java.io.Serializable {

	private Long id;
	private AgentMst agentMst;
	private LicOblChecklist licOblChecklist;
	private LicProposerDtls licProposerDtls;
	private TieupCompyMst tieupCompyMst;
	private DesignationMst designationMst;
	private BranchMst branchMst;
	private LicProductValueMst licProductValueMst;
	private ParentCompyMst parentCompyMst;
	private LicInsuredDtls licInsuredDtls;
	private LicInsuredBankDtls licInsuredBankDtls;
	private LicHubMst oblHubMst;
	private String oblApplNo;
	private String finYr;
	private Date businessDate;
	private String remarks;
	private String printFlag;
	private PicBranchMst picBranchMstId;
	private String secondaryEntryFlag;
	private Long createdBy;
	private Long modifiedBy;
	private Long deletedBy;
	private Date createdDate;
	private Date modifiedDate;
	private Date deletedDate;
	private String deleteFlag;
	private LicBusinessTxn licBusinessTxn;	
	private LicBrnhHubPicMapDtls brnhHubMapDtls;
	private LicBrnhHubPicPodDtls brnhHubPodDtls;
	private LicBrnhHubPicPodDtls hubPicPodDtls;
	private LicMarkingToQcDtls licMarkingToQcDtls;	
	private LicBrnhHubPicMapDtls hubPicMapDtls;	
	private LicPisMst licPisMst;
	private String migrationFlag;
	private String legacyAgentCode;
	private String receiptNo;
	
	private List<LicRequirementDtls> licRequirementDtlses = new ArrayList<LicRequirementDtls>();
	private List<LicNomineeDtls> licNomineeDtlses = new ArrayList<LicNomineeDtls>();
	private List<LicPremApplMapping> licPremApplMappings =new ArrayList<LicPremApplMapping>();
	private List<LicApplBocMapping> licApplBocMappings = new ArrayList<LicApplBocMapping>();
	private List<LicPolicyMst> licPolicyMsts = new ArrayList<LicPolicyMst>();
	
	
	public LicOblApplicationMst() {
	}


	@Id
	@SequenceGenerator(name="LIC_OBL_APPLICATION_MST_SEQ",sequenceName="LIC_OBL_APPLICATION_MST_SEQ")
	@GeneratedValue(generator="LIC_OBL_APPLICATION_MST_SEQ",strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false, precision = 22, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AGENT_MST_ID")
	public AgentMst getAgentMst() {
		return this.agentMst;
	}

	public void setAgentMst(AgentMst agentMst) {
		this.agentMst = agentMst;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIC_OBL_CHECKLIST_ID")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicOblChecklist getLicOblChecklist() {
		return this.licOblChecklist;
	}

	public void setLicOblChecklist(LicOblChecklist licOblChecklist) {
		this.licOblChecklist = licOblChecklist;
	}

	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicProposerDtls getLicProposerDtls() {
		return this.licProposerDtls;
	}

	public void setLicProposerDtls(LicProposerDtls licProposerDtls) {
		this.licProposerDtls = licProposerDtls;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIEUP_COMPY_MST_ID")
	public TieupCompyMst getTieupCompyMst() {
		return this.tieupCompyMst;
	}

	public void setTieupCompyMst(TieupCompyMst tieupCompyMst) {
		this.tieupCompyMst = tieupCompyMst;
	}
	
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicInsuredBankDtls getLicInsuredBankDtls() {
		return licInsuredBankDtls;
	}

	public void setLicInsuredBankDtls(LicInsuredBankDtls licInsuredBankDtls) {
		this.licInsuredBankDtls = licInsuredBankDtls;
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
	@JoinColumn(name = "LIC_PRODUCT_VALUE_MST_ID")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicProductValueMst getLicProductValueMst() {
		return this.licProductValueMst;
	}

	public void setLicProductValueMst(LicProductValueMst licProductValueMst) {
		this.licProductValueMst = licProductValueMst;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_COMPY_MST_ID")
	public ParentCompyMst getParentCompyMst() {
		return this.parentCompyMst;
	}

	public void setParentCompyMst(ParentCompyMst parentCompyMst) {
		this.parentCompyMst = parentCompyMst;
	}

	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicInsuredDtls getLicInsuredDtls() {
		return this.licInsuredDtls;
	}

	public void setLicInsuredDtls(LicInsuredDtls licInsuredDtls) {
		this.licInsuredDtls = licInsuredDtls;
	}

	
	@Column(name = "OBL_APPL_NO", length=50, unique = true, nullable = false)
	public String getOblApplNo() {
		return this.oblApplNo;
	}

	public void setOblApplNo(String oblApplNo) {
		this.oblApplNo = oblApplNo;
	}

	
	@Column(name = "FIN_YR", length = 50)
	public String getFinYr() {
		return this.finYr;
	}

	public void setFinYr(String finYr) {
		this.finYr = finYr;
	}
	
	
	@Column(name = "SECONDARY_ENTRY_FLAG", length = 1)
	public String getSecondaryEntryFlag() {
		return secondaryEntryFlag;
	}

	public void setSecondaryEntryFlag(String secondaryEntryFlag) {
		this.secondaryEntryFlag = secondaryEntryFlag;
	}

	
	@Temporal(TemporalType.DATE)
	@Column(name = "BUSINESS_DATE", length = 7)
	public Date getBusinessDate() {
		return this.businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}
	

	@Column(name = "REMARKS", length = 50)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	@Column(name = "PRINT_FLAG", length = 1)
	public String getPrintFlag() {
		return this.printFlag;
	}

	public void setPrintFlag(String printFlag) {
		this.printFlag = printFlag;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PIC_BRANCH_ID")
	public PicBranchMst getPicBranchMstId() {
		return picBranchMstId;
	}

	public void setPicBranchMstId(PicBranchMst picBranchMstId) {
		this.picBranchMstId = picBranchMstId;
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
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<LicNomineeDtls> getLicNomineeDtlses() {
		return this.licNomineeDtlses;
	}

	public void setLicNomineeDtlses(List<LicNomineeDtls> licNomineeDtlses) {
		this.licNomineeDtlses = licNomineeDtlses;
	}
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicBusinessTxn getLicBusinessTxn() {
		return licBusinessTxn;
	}

	public void setLicBusinessTxn(LicBusinessTxn licBusinessTxn) {
		this.licBusinessTxn = licBusinessTxn;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BRNH_HUB_MAP_DTLS_ID")
	public LicBrnhHubPicMapDtls getBrnhHubMapDtls() {
		return brnhHubMapDtls;
	}

	public void setBrnhHubMapDtls(LicBrnhHubPicMapDtls brnhHubMapDtls) {
		this.brnhHubMapDtls = brnhHubMapDtls;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HUB_PIC_MAP_DTLS_ID")
	public LicBrnhHubPicMapDtls getHubPicMapDtls() {
		return hubPicMapDtls;
	}

	public void setHubPicMapDtls(LicBrnhHubPicMapDtls hubPicMapDtls) {
		this.hubPicMapDtls = hubPicMapDtls;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BRNH_HUB_POD_DTLS_ID")
	public LicBrnhHubPicPodDtls getBrnhHubPodDtls() {
		return brnhHubPodDtls;
	}

	public void setBrnhHubPodDtls(LicBrnhHubPicPodDtls brnhHubPodDtls) {
		this.brnhHubPodDtls = brnhHubPodDtls;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OBL_HUB_MST_ID")
	public LicHubMst getOblHubMst() {
		return oblHubMst;
	}

	public void setOblHubMst(LicHubMst oblHubMst) {
		this.oblHubMst = oblHubMst;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIC_MRK_TO_QC_ID")
	@Cascade({CascadeType.SAVE_UPDATE})
	public LicMarkingToQcDtls getLicMarkingToQcDtls() {
		return licMarkingToQcDtls;
	}

	public void setLicMarkingToQcDtls(LicMarkingToQcDtls licMarkingToQcDtls) {
		this.licMarkingToQcDtls = licMarkingToQcDtls;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<LicApplBocMapping> getLicApplBocMappings() {
		return licApplBocMappings;
	}

	public void setLicApplBocMappings(List<LicApplBocMapping> licApplBocMappings) {
		this.licApplBocMappings = licApplBocMappings;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HUB_PIC_POD_DTLS_ID")
	public LicBrnhHubPicPodDtls getHubPicPodDtls() {
		return hubPicPodDtls;
	}

	public void setHubPicPodDtls(LicBrnhHubPicPodDtls hubPicPodDtls) {
		this.hubPicPodDtls = hubPicPodDtls;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIC_PIS_MST_ID")
	public LicPisMst getLicPisMst() {
		return licPisMst;
	}

	public void setLicPisMst(LicPisMst licPisMst) {
		this.licPisMst = licPisMst;
	}
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<LicPremApplMapping> getLicPremApplMappings() {
		return licPremApplMappings;
	}

	public void setLicPremApplMappings(List<LicPremApplMapping> licPremApplMappings) {
		this.licPremApplMappings = licPremApplMappings;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<LicRequirementDtls> getLicRequirementDtlses() {
		return licRequirementDtlses;
	}

	public void setLicRequirementDtlses(
			List<LicRequirementDtls> licRequirementDtlses) {
		this.licRequirementDtlses = licRequirementDtlses;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "licOblApplicationMst")
	@Cascade({CascadeType.SAVE_UPDATE})
	public List<LicPolicyMst> getLicPolicyMsts() {
		return licPolicyMsts;
	}

	public void setLicPolicyMsts(List<LicPolicyMst> licPolicyMsts) {
		this.licPolicyMsts = licPolicyMsts;
	}
	
	
	@Column(name="MIGRATION_FLAG",length=1)
	public String getMigrationFlag() {
		return migrationFlag;
	}

	public void setMigrationFlag(String migrationFlag) {
		this.migrationFlag = migrationFlag;
	}
	
	
	@Column(name="LEGACY_AG_CODE",length=50)
	public String getLegacyAgentCode() {
		return legacyAgentCode;
	}
	public void setLegacyAgentCode(String legacyAgentCode) {
		this.legacyAgentCode = legacyAgentCode;
	}
	@Column(name="RECEIPT_NO",length=100)
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	
	
}
