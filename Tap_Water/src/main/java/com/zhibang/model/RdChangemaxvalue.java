package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class RdChangemaxvalue implements Serializable {

  private static final long serialVersionUID = 7324073388324978617L;
  private Integer id;
  private Date datee;
  private Integer empId;
  private UsUser userNo;
  private UsMeter meterNo;
  private Integer maxValue1;
  private Integer maxValue2;
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

  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  public UsUser getUserNo() {
    return userNo;
  }

  public void setUserNo(UsUser userNo) {
    this.userNo = userNo;
  }

  public UsMeter getMeterNo() {
    return meterNo;
  }

  public void setMeterNo(UsMeter meterNo) {
    this.meterNo = meterNo;
  }

  public Integer getMaxValue1() {
    return maxValue1;
  }

  public void setMaxValue1(Integer maxValue1) {
    this.maxValue1 = maxValue1;
  }

  public Integer getMaxValue2() {
    return maxValue2;
  }

  public void setMaxValue2(Integer maxValue2) {
    this.maxValue2 = maxValue2;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "RdChangemaxvalue{" +
            "id=" + id +
            ", datee=" + datee +
            ", empId=" + empId +
            ", userNo=" + userNo +
            ", meterNo=" + meterNo +
            ", maxValue1=" + maxValue1 +
            ", maxValue2=" + maxValue2 +
            ", remark='" + remark + '\'' +
            '}';
  }
}
