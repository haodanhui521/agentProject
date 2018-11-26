package com.agent.core.controller;


import com.agent.core.pojos.Org;
import com.agent.core.response.Result;
import com.agent.core.service.OrgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private OrgService orgService;

    @RequestMapping("/all")
    public Result<String> getTradeInfo(){
        Org org = new Org();
        org.setBelongToOrg("1111");
        org.setCreatedAt(new Date());
        org.setCreatorCreateType("sss");
        org.setCreatorName("222");
        org.setDesc("desc");
        org.setEmail("21231231");
        org.setLevel(Short.valueOf("111"));
        org.setMaxLevel(Short.valueOf("222"));
        org.setMobile("123344455");
        org.setName("eqweqweq");
        org.setNickName("asdasdas");
        org.setOutOrgNo("123123");
        org.setStatus("normal");
        org.setUpdatedAt(new Date());
        org.setOrgNo("1231231");
        org.setOwnToOrg("23123");
        org.setType("123123");
        orgService.registerOrg(org);
        return Result.ofSuccess("");
    }
}
