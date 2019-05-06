package com.tongwei.test.domain.dto;

import com.tongwei.test.domain.eo.Employee;
import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/**
 * @desc IDM雇员表测试
 * @author 
 */
public class EmployeeDto implements Serializable {
    private Integer  id;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date updatedAt;


    public void setId(Integer  id){
        this.id = id;
    }

    public Integer  getId(){
        return this.id;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public String getCreatedBy(){
        return this.createdBy;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
        return this.createdAt;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
        return this.updatedBy;
    }

    public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
        return this.updatedAt;
    }
}

