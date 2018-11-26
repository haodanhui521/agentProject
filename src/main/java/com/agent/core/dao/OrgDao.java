package com.agent.core.dao;

import com.agent.core.pojos.Org;
import com.agent.core.request.PageRequest;

import java.util.List;

public interface OrgDao {

    int insertOrg(Org org);

    Org selectByOrgNo(String orgNo);

    List<Org> selectAll(PageRequest pageRequest);
}
