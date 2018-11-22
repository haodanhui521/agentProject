package com.agent.core.service;

import com.agent.core.generated.tables.records.TradeInfoRecord;

import java.util.List;

public interface TradeInfoService {

    List<TradeInfoRecord> selectAll();
}
