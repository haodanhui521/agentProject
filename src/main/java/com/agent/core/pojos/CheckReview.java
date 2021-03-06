/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 审核
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckReview implements Serializable {

    private static final long serialVersionUID = -1305133235;

    private Long      id;
    private String    belongToOrg;
    private String    ownToOrg;
    private String    applicatorName;
    private String    checkerName;
    private Timestamp checkTime;
    private String    checkRemark;
    private String    body;
    private String    field_1;
    private String    field_2;
    private String    field_3;
    private String    field_4;
    private String    field_5;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String    status;

    public CheckReview() {}

    public CheckReview(CheckReview value) {
        this.id = value.id;
        this.belongToOrg = value.belongToOrg;
        this.ownToOrg = value.ownToOrg;
        this.applicatorName = value.applicatorName;
        this.checkerName = value.checkerName;
        this.checkTime = value.checkTime;
        this.checkRemark = value.checkRemark;
        this.body = value.body;
        this.field_1 = value.field_1;
        this.field_2 = value.field_2;
        this.field_3 = value.field_3;
        this.field_4 = value.field_4;
        this.field_5 = value.field_5;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.status = value.status;
    }

    public CheckReview(
        Long      id,
        String    belongToOrg,
        String    ownToOrg,
        String    applicatorName,
        String    checkerName,
        Timestamp checkTime,
        String    checkRemark,
        String    body,
        String    field_1,
        String    field_2,
        String    field_3,
        String    field_4,
        String    field_5,
        Timestamp createdAt,
        Timestamp updatedAt,
        String    status
    ) {
        this.id = id;
        this.belongToOrg = belongToOrg;
        this.ownToOrg = ownToOrg;
        this.applicatorName = applicatorName;
        this.checkerName = checkerName;
        this.checkTime = checkTime;
        this.checkRemark = checkRemark;
        this.body = body;
        this.field_1 = field_1;
        this.field_2 = field_2;
        this.field_3 = field_3;
        this.field_4 = field_4;
        this.field_5 = field_5;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBelongToOrg() {
        return this.belongToOrg;
    }

    public void setBelongToOrg(String belongToOrg) {
        this.belongToOrg = belongToOrg;
    }

    public String getOwnToOrg() {
        return this.ownToOrg;
    }

    public void setOwnToOrg(String ownToOrg) {
        this.ownToOrg = ownToOrg;
    }

    public String getApplicatorName() {
        return this.applicatorName;
    }

    public void setApplicatorName(String applicatorName) {
        this.applicatorName = applicatorName;
    }

    public String getCheckerName() {
        return this.checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public Timestamp getCheckTime() {
        return this.checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckRemark() {
        return this.checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getField_1() {
        return this.field_1;
    }

    public void setField_1(String field_1) {
        this.field_1 = field_1;
    }

    public String getField_2() {
        return this.field_2;
    }

    public void setField_2(String field_2) {
        this.field_2 = field_2;
    }

    public String getField_3() {
        return this.field_3;
    }

    public void setField_3(String field_3) {
        this.field_3 = field_3;
    }

    public String getField_4() {
        return this.field_4;
    }

    public void setField_4(String field_4) {
        this.field_4 = field_4;
    }

    public String getField_5() {
        return this.field_5;
    }

    public void setField_5(String field_5) {
        this.field_5 = field_5;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CheckReview (");

        sb.append(id);
        sb.append(", ").append(belongToOrg);
        sb.append(", ").append(ownToOrg);
        sb.append(", ").append(applicatorName);
        sb.append(", ").append(checkerName);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(checkRemark);
        sb.append(", ").append(body);
        sb.append(", ").append(field_1);
        sb.append(", ").append(field_2);
        sb.append(", ").append(field_3);
        sb.append(", ").append(field_4);
        sb.append(", ").append(field_5);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
