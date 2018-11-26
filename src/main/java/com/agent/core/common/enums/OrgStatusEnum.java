package com.agent.core.common.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum OrgStatusEnum {
    NORMAL("normal", "正常"),
    DISABLED("disabled", "禁用"),
            ;
    private String key;
    private String value;
    OrgStatusEnum(String key, String value){
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
    public static OrgStatusEnum getAccountType(String key){
        Optional<OrgStatusEnum> op = Stream.of(OrgStatusEnum.values()).filter(k -> k.getKey().equals(key)).findFirst();
        if(op.isPresent()){
            return op.get();
        }
        return NORMAL;
    }
}
