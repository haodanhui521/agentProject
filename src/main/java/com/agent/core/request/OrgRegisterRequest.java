package com.agent.core.request;


import com.agent.core.common.enums.OrgTypeEnum;
import com.agent.core.common.validator.anno.InEnum;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class OrgRegisterRequest {

    private String belongToOrg;

    private String ownToOrg;

    private String outOrgNo;

    private String name;

    private String nickName;

    private String desc;

    private String mobile;

    private String email;

    private String website;

    @NotBlank(message = "组织类型(type)不能为空")
    @InEnum(enumClass = OrgTypeEnum.class,message = "组织类型(type)不合法",attribute = "key")
    private String type;

    @Length(min = 0,message = "层级(level)不合法")
    private Integer level;

    @Length(min = 0,message = "最大层级(level)不合法")
    private Integer maxLevel;

    private String creatorCreateType;

    private String creatorName;

    private String status;

    private Integer parentLevel;

}
