package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户管理对象 t_users
 * 
 * @author me
 * @date 2025-04-05
 */
public class Users extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID，自动递增的主键 */
    private Long id;

    /** 用户名，唯一标识符 */
    @Excel(name = "用户名，唯一标识符")
    private String username;

    /** 用户密码，存储加密后的密码 */
    @Excel(name = "用户密码，存储加密后的密码")
    private String password;

    /** 用户真实姓名 */
    @Excel(name = "用户真实姓名")
    private String realName;

    /** 用户电话号码 */
    @Excel(name = "用户电话号码")
    private String phone;

    /** 用户角色：普通用户或管理员 */
    @Excel(name = "用户角色：普通用户或管理员")
    private String role;

    /** 用户状态：待审核、已批准或已拒绝 */
    @Excel(name = "用户状态：待审核、已批准或已拒绝")
    private String status;

    /** 用户创建时间，默认为当前时间戳 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "用户创建时间，默认为当前时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setRole(String role) 
    {
        this.role = role;
    }

    public String getRole() 
    {
        return role;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("realName", getRealName())
            .append("phone", getPhone())
            .append("role", getRole())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
