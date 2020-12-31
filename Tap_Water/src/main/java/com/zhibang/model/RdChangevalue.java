package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class RdChangevalue implements Serializable {

  private static final long serialVersionUID = 2686286519767983462L;
  private Integer id;
  private Date datee;
  private SyEmp empId;
  private UsUser userNo;
  private Integer preValue1;
  private Integer preValue2;
  private String remark;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public UsUser getUserNo() {
    return userNo;
  }

  public void setUserNo(UsUser userNo) {
    this.userNo = userNo;
  }

  public Integer getPreValue1() {
    return preValue1;
  }

  public void setPreValue1(Integer preValue1) {
    this.preValue1 = preValue1;
  }

  public Integer getPreValue2() {
    return preValue2;
  }

  public void setPreValue2(Integer preValue2) {
    this.preValue2 = preValue2;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "RdChangevalue{" +
            "id=" + id +
            ", datee=" + datee +
            ", empId=" + empId +
            ", userNo=" + userNo +
            ", preValue1=" + preValue1 +
            ", preValue2=" + preValue2 +
            ", remark='" + remark + '\'' +
            '}';
  }
}
