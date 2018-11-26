package com.agent.core.service.impl;

import com.agent.core.dao.OrgDao;
import com.agent.core.pojos.Org;
import com.agent.core.request.OrgRegisterRequest;
import com.agent.core.service.OrgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgDao orgDao;


    @Override
    public void registerOrg(OrgRegisterRequest orgRegisterRequest) {
        Org org = new Org();
        orgDao.insertOrg(org);
    }
}
