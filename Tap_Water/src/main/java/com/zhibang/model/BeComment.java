package com.zhibang.model;


import java.util.Date;

public class BeComment {

  private Integer id;
  private String orderNo;
  private Date datee;
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
            ", orderNo='" + orderNo + '\'' +
            ", datee=" + datee +
            ", empId=" + empId +
            ", comment='" + comment + '\'' +
            '}';
  }
}
