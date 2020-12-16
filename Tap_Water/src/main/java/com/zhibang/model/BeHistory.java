package com.zhibang.model;


import java.io.Serializable;
import java.util.Date;

public class BeHistory implements Serializable {

  private static final long serialVersionUID = -8102240706018431495L;
  private Integer id;
  private String orderNo;
  private Integer stepId;
  private Date datee;
  private Integer empId;
  private Boolean isBack;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public Integer getStepId() {
    return stepId;
  }

  public void setStepId(Integer stepId) {
    this.stepId = stepId;
  }


  public Date getDatee() {
    return datee;
  }

  public void setDatee(Date datee) {
    this.datee = datee;
  }


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }


  public Boolean getIsBack() {
    return isBack;
  }

  public void setIsBack(Boolean isBack) {
    this.isBack = isBack;
  }

  @Override
  public String toString() {
    return "BeHistory{" +
            "id=" + id +
            ", orderNo='" + orderNo + '\'' +
            ", stepId=" + stepId +
            ", datee=" + datee +
            ", empId=" + empId +
            ", isBack=" + isBack +
            '}';
  }
}
