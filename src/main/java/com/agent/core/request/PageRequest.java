package com.agent.core.request;

import lombok.Data;

@Data
public class PageRequest {
    private Integer pageNo;
    private Integer pageSize;
    public Integer getOffset(){
        return (this.getPageNo() -1) * this.getPageSize();
    }
    public Integer getLimit(){
        return this.getPageSize();
    }
}
