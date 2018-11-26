package com.agent.core.service.impl;

import com.agent.core.common.enums.OrgStatusEnum;
import com.agent.core.common.enums.OrgTypeEnum;
import com.agent.core.dao.OrgDao;
import com.agent.core.pojos.Org;
import com.agent.core.request.OrgRegisterRequest;
import com.agent.core.service.OrgService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
@Slf4j
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgDao orgDao;


    @Override
    public void registerOrg(OrgRegisterRequest orgRegisterRequest) {
        Org org = new Org();
        org.setType(orgRegisterRequest.getType());
        org.setOwnToOrg(StringUtils.equals(orgRegisterRequest.getType(), OrgTypeEnum.ROOT.getKey())?"000000000000000":orgRegisterRequest.getOwnToOrg());
        org.setOrgNo(StringUtils.equals(orgRegisterRequest.getType(), OrgTypeEnum.ROOT.getKey())?"000000000000000":"");
        org.setStatus(OrgStatusEnum.NORMAL.getKey());
        org.setOutOrgNo(StringUtils.equals(orgRegisterRequest.getType(), OrgTypeEnum.ROOT.getKey())?"000000000000000":orgRegisterRequest.getOutOrgNo());
        org.setNickName(orgRegisterRequest.getNickName());
        org.setName(orgRegisterRequest.getName());
        org.setMobile(orgRegisterRequest.getMobile());
        org.setMaxLevel(orgRegisterRequest.getMaxLevel());
        org.setLevel(StringUtils.equals(orgRegisterRequest.getType(), OrgTypeEnum.ROOT.getKey())?1:orgRegisterRequest.getParentLevel()+1);
        org.setEmail(orgRegisterRequest.getEmail());
        org.setDesc(orgRegisterRequest.getDesc());
        org.setCreatorName(orgRegisterRequest.getCreatorName());
        org.setCreatorCreateType(orgRegisterRequest.getCreatorCreateType());
        org.setBelongToOrg(StringUtils.equals(orgRegisterRequest.getType(), OrgTypeEnum.ROOT.getKey())?"000000000000000":orgRegisterRequest.getBelongToOrg());
        org.setCreatedAt(new Date());
        org.setUpdatedAt(new Date());
        org.setWebsite(orgRegisterRequest.getWebsite());
        orgDao.insertOrg(org);
    }
}
