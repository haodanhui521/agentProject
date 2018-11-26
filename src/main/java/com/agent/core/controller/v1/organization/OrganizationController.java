package com.agent.core.controller.v1.organization;


import com.agent.core.common.enums.ErrorCodeEnum;
import com.agent.core.exception.BizException;
import com.agent.core.pojos.Org;
import com.agent.core.request.OrgRegisterRequest;
import com.agent.core.response.Result;
import com.agent.core.service.OrgService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/v1/agent-core/organization")
@Slf4j
public class OrganizationController {

    @Autowired
    private OrgService orgService;

    @PostMapping("/register/{type}")
    public Result<String> register(@PathVariable("type") String type, @Valid  @RequestBody OrgRegisterRequest orgRegisterRequest){
        log.info(">>>>> {}注册开始,request:{}",type, JSON.toJSONString(orgRegisterRequest));
        long time = System.currentTimeMillis();
        Result result = null;
        try{
            orgService.registerOrg(orgRegisterRequest);
            result =  Result.ofSuccess("");
        }catch (BizException e){
            result = Result.ofFail(e.getCode(),e.getMsg());
        }catch (Exception e){
            result = Result.ofFail(ErrorCodeEnum.SYSTEM_EXCEPTION.getErrorCode(),ErrorCodeEnum.SYSTEM_EXCEPTION.getErrorMsg());
        }
        log.info(">>>>> {}注册结束,耗时:{}ms",type,System.currentTimeMillis()-time);
        return result;
    }
}
