package com.agent.core.service.impl;

import com.agent.core.generated.tables.TradeInfo;
import com.agent.core.generated.tables.records.TradeInfoRecord;
import com.agent.core.service.TradeInfoService;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
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
    public List<TradeInfoRecord> selectAll() {
        List<TradeInfoRecord> tradeInfoRecordList = dslContext.select(t.APP_ID,t.MERCHANT_NO).from(t).fetch().into(TradeInfoRecord.class);
        return tradeInfoRecordList;
    }
}
