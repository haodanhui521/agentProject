/*
 * This file is generated by jOOQ.
*/
package com.agent.core.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 权限
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 323686399;

    private Long      id;
    private String    resourceCode;
    private String    roleNo;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String    status;

    public RolePermission() {}

    public RolePermission(RolePermission value) {
        this.id = value.id;
        this.resourceCode = value.resourceCode;
        this.roleNo = value.roleNo;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.status = value.status;
    }

    public RolePermission(
        Long      id,
        String    resourceCode,
        String    roleNo,
        Timestamp createdAt,
        Timestamp updatedAt,
        String    status
    ) {
        this.id = id;
        this.resourceCode = resourceCode;
        this.roleNo = roleNo;
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

    public String getResourceCode() {
        return this.resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getRoleNo() {
        return this.roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
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
        StringBuilder sb = new StringBuilder("RolePermission (");

        sb.append(id);
        sb.append(", ").append(resourceCode);
        sb.append(", ").append(roleNo);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
