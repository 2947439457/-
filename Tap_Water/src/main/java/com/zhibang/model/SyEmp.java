package com.zhibang.model;

import java.io.Serializable;

public class SyEmp implements Serializable {

  private static final long serialVersionUID = 6320442346478126979L;
  private Integer id;
  private String empName;
  private String empNo;
  private String pwd;
  private SyDept deptId;
  private String remark;
  private Integer disabled;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public SyDept getDeptId() {
    return deptId;
  }

  public void setDeptId(SyDept deptId) {
    this.deptId = deptId;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Integer getDisabled() {
    return disabled;
  }

  public void setDisabled(Integer disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "SyEmp{" +
            "id=" + id +
            ", empName='" + empName + '\'' +
            ", empNo='" + empNo + '\'' +
            ", pwd='" + pwd + '\'' +
            ", deptId=" + deptId +
            ", remark='" + remark + '\'' +
            ", disabled=" + disabled +
            '}';
  }
}
