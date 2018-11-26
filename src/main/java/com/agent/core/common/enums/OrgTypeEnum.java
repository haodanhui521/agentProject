package com.agent.core.common.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum OrgTypeEnum {
    ROOT("root", "根组织"),
    PLATFORM("platform", "平台"),
    MERCHANT("merchant", "商户"),
    AGENT("agent", "代理商"),
            ;
    private String key;
    private String value;
    OrgTypeEnum(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public static OrgTypeEnum getAccountType(String key){
        Optional<OrgTypeEnum> op = Stream.of(OrgTypeEnum.values()).filter(k -> k.getKey().equals(key)).findFirst();
        if(op.isPresent()){
            return op.get();
        }
        return ROOT;
    }
}
