package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyEmp implements Serializable {
//员工
  private static final long serialVersionUID = 6320442346478126979L;
  private Integer id;
  private String empName;//员工姓名
  private String empNo;//工号
  private String pwd;//密码
  private SyDept deptId;//部门ID
  private String remark;//备注
  private Integer disabled;//是否禁用

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
