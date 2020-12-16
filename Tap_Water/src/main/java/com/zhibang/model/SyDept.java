package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyDept implements Serializable {
    //部门
  private static final long serialVersionUID = -9122905395861015118L;
  private Integer id;
  private String deptName;//部门名称
  private String remark;//备注
  private Boolean disabled;//禁用


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


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
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
