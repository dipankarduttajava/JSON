package com.gtfs.dao.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gtfs.bean.BranchMst;
import com.gtfs.dao.BranchMstDao;
import com.gtfs.dto.BranchMstDto;
@Repository
public class BranchMstDaoImpl implements BranchMstDao,Serializable{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<BranchMstDto> findAll() {
		List<BranchMstDto> list=null;
	 	Session session = null;
	    try {
	        session = sessionFactory.openSession();
	        
	        Criteria criteria = session.createCriteria(BranchMst.class);
	        
	        ProjectionList projectionList = Projections.projectionList();
	        projectionList.add(Projections.property("branchId"),"branchId");
	        projectionList.add(Projections.property("divisionMstByPrntDivIdBns.divId"),"divisionMstByPrntDivIdBns");
	        projectionList.add(Projections.property("divisionMstByPrntDivIdOps.divId"),"divisionMstByPrntDivIdOps");
	        projectionList.add(Projections.property("stateMst.stateId"),"stateMst");
	        projectionList.add(Projections.property("branchName"),"branchName");
	        projectionList.add(Projections.property("branchAbbr"),"branchAbbr");
	        projectionList.add(Projections.property("branchCode"),"branchCode");
	        projectionList.add(Projections.property("addr1"),"addr1");
	        projectionList.add(Projections.property("addr2"),"addr2");
	        projectionList.add(Projections.property("addr3"),"addr3");
	        projectionList.add(Projections.property("city"),"city");
	        projectionList.add(Projections.property("pin"),"pin");
	        projectionList.add(Projections.property("phone"),"phone");
	        projectionList.add(Projections.property("mobile"),"mobile");
	        projectionList.add(Projections.property("email"),"email");
	        projectionList.add(Projections.property("activeFlag"),"activeFlag");
	        projectionList.add(Projections.property("trnfLocation"),"trnfLocation");
	        projectionList.add(Projections.property("remarks"),"remarks");
	        projectionList.add(Projections.property("userId"),"userId");
	        projectionList.add(Projections.property("dateTime"),"dateTime");
	        projectionList.add(Projections.property("licHubType"),"licHubType");
	        criteria.setProjection(projectionList);
	        
	        criteria.setResultTransformer(Transformers.aliasToBean(BranchMstDto.class));
	        
	        list = criteria.list();
	        
	    } catch (Exception e) {
	    } finally {
	        session.close();
	    }
	    return list;
	}

	@Override
	public List<BranchMstDto> findById(Long id) {
		List<BranchMstDto> list=null;
	 	Session session = null;
	    try {
	        session = sessionFactory.openSession();
	        
	        Criteria criteria = session.createCriteria(BranchMst.class);
	        
	        ProjectionList projectionList = Projections.projectionList();
	        projectionList.add(Projections.property("branchId"),"branchId");
	        projectionList.add(Projections.property("divisionMstByPrntDivIdBns.divId"),"divisionMstByPrntDivIdBns");
	        projectionList.add(Projections.property("divisionMstByPrntDivIdOps.divId"),"divisionMstByPrntDivIdOps");
	        projectionList.add(Projections.property("stateMst.stateId"),"stateMst");
	        projectionList.add(Projections.property("branchName"),"branchName");
	        projectionList.add(Projections.property("branchAbbr"),"branchAbbr");
	        projectionList.add(Projections.property("branchCode"),"branchCode");
	        projectionList.add(Projections.property("addr1"),"addr1");
	        projectionList.add(Projections.property("addr2"),"addr2");
	        projectionList.add(Projections.property("addr3"),"addr3");
	        projectionList.add(Projections.property("city"),"city");
	        projectionList.add(Projections.property("pin"),"pin");
	        projectionList.add(Projections.property("phone"),"phone");
	        projectionList.add(Projections.property("mobile"),"mobile");
	        projectionList.add(Projections.property("email"),"email");
	        projectionList.add(Projections.property("activeFlag"),"activeFlag");
	        projectionList.add(Projections.property("trnfLocation"),"trnfLocation");
	        projectionList.add(Projections.property("remarks"),"remarks");
	        projectionList.add(Projections.property("userId"),"userId");
	        projectionList.add(Projections.property("dateTime"),"dateTime");
	        projectionList.add(Projections.property("licHubType"),"licHubType");
	        criteria.setProjection(projectionList);
	        
	        criteria.setResultTransformer(Transformers.aliasToBean(BranchMstDto.class));
	        
	        criteria.add(Restrictions.eq("branchId", id));
	        list = criteria.list();
	        
	    } catch (Exception e) {
	    } finally {
	        session.close();
	    }
	    return list;
	}

}
