package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyEmpareapower implements Serializable {
//员工辖区权限
  private static final long serialVersionUID = -2247551956030742021L;
  private Integer id;
  private SyEmp empId;//员工ID
  private SyArea areaId;//抄表辖区ID


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
