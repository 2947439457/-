package com.zhibang.model;


public class BeHistory {

  private Integer id;
  private String orderNo;
  private Integer stepId;
  private java.sql.Timestamp datee;
  private Integer empId;
  private String isBack;


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


  public java.sql.Timestamp getDatee() {
    return datee;
  }

  public void setDatee(java.sql.Timestamp datee) {
    this.datee = datee;
  }


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }


  public String getIsBack() {
    return isBack;
  }

  public void setIsBack(String isBack) {
    this.isBack = isBack;
  }

}
