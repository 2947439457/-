package com.zhibang.model;

import java.io.Serializable;

public class SyEmpareapower implements Serializable {
//员工辖区权限
  private static final long serialVersionUID = -2247551956030742021L;
  private Integer id;
  private Integer empId;//员工ID
  private Integer areaId;//抄表辖区ID


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }


  public Integer getAreaId() {
    return areaId;
  }

  public void setAreaId(Integer areaId) {
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
