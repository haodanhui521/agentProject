package com.agent.core.dao.impl;

import com.agent.core.dao.OrgDao;
import com.agent.core.pojos.Org;
import com.agent.core.request.PageRequest;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class OrgDaoImpl implements OrgDao {


    @Autowired
    private DSLContext dslContext;

    com.agent.core.generated.tables.Org o = com.agent.core.generated.tables.Org.ORG;

    @Override
    @Transactional
    public int insertOrg(Org org) {
        return dslContext.newRecord(o,org).insert();
    }

    @Override
    public Org selectByOrgNo(String orgNo) {
        return null;
    }

    @Override
    public List<Org> selectAll(PageRequest pageRequest) {
        return null;
    }
}
