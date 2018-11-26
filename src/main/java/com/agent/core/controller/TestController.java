/*
package com.agent.core.controller;


import com.agent.core.generated.tables.records.TradeInfoRecord;
import com.agent.core.response.Result;
import com.agent.core.service.TradeInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TradeInfoService tradeInfoService;

    @RequestMapping("/all")
    public Result<List<com.agent.core.pojos.TradeInfo>> getTradeInfo(){
        List<com.agent.core.pojos.TradeInfo> tradeInfoList = tradeInfoService.selectAll();
        return Result.ofSuccess(tradeInfoList);
    }
}
*/
