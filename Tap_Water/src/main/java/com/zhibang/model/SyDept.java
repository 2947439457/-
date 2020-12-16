package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyDept implements Serializable {

  private static final long serialVersionUID = -9122905395861015118L;
  private Integer id;
  private String deptName;
  private String remark;
  private String disabled;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "SyDept{" +
            "id=" + id +
            ", deptName='" + deptName + '\'' +
            ", remark='" + remark + '\'' +
            ", disabled='" + disabled + '\'' +
            '}';
  }
}
