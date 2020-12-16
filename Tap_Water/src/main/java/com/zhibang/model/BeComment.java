package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class BeComment implements Serializable {

    private static final long serialVersionUID = 3612976991643067301L;
    private Integer id;
    private BeOrder orderNo;
    private Date datee;
    private SyEmp empId;
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BeOrder getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(BeOrder orderNo) {
        this.orderNo = orderNo;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
    }

    public SyEmp getEmpId() {
        return empId;
    }

    public void setEmpId(SyEmp empId) {
        this.empId = empId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "BeComment{" +
                "id=" + id +
                ", orderNo=" + orderNo +
                ", datee=" + datee +
                ", empId=" + empId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
