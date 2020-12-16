package com.zhibang.model;

import java.io.Serializable;

public class SyEmpareapower implements Serializable {

  private static final long serialVersionUID = -2247551956030742021L;
  private Integer id;
  private SyEmp empId;
  private SyArea areaId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SyEmp getEmpId() {
    return empId;
  }

  public void setEmpId(SyEmp empId) {
    this.empId = empId;
  }

  public SyArea getAreaId() {
    return areaId;
  }

  public void setAreaId(SyArea areaId) {
    this.areaId = areaId;
  }

  @Override
  public String toString() {
    return "SyEmpareapower{" +
            "id=" + id +
            ", empId=" + empId +
            ", areaId=" + areaId +
            '}';
  }
}
