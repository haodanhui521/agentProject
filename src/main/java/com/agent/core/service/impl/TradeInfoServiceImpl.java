/*
package com.agent.core.service.impl;

import com.agent.core.daos.TradeInfoDao;
import com.agent.core.generated.tables.TradeInfo;
import com.agent.core.generated.tables.records.TradeInfoRecord;
import com.agent.core.service.TradeInfoService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class TradeInfoServiceImpl implements TradeInfoService {

    @Autowired
    private DSLContext dslContext;

    TradeInfo t = TradeInfo.TRADE_INFO;



    @Override
    public List<com.agent.core.pojos.TradeInfo> selectAll() {
        com.agent.core.pojos.TradeInfo tradeInfo = new com.agent.core.pojos.TradeInfo();
*/
/*
        List<com.agent.core.pojos.TradeInfo> tradeInfoRecordList = dslContext.select().from(t).offset(1).limit(10).fetchInto(tradeInfo.getClass());
*//*

        List<com.agent.core.pojos.TradeInfo> tradeInfoRecordList = new TradeInfoDao().findAll();
        for(com.agent.core.pojos.TradeInfo tradeInfos:tradeInfoRecordList){
            System.out.println(JSON.toJSONString(tradeInfos));
        }
        return tradeInfoRecordList;
    }
}
*/
