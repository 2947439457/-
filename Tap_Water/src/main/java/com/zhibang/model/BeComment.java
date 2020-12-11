package com.zhibang.model;


public class BeComment {

  private Integer id;
  private String orderNo;
  private java.sql.Timestamp datee;
  private Integer empId;
  private String comment;


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


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

}
