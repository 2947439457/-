package com.zhibang.model;

public class SyEmpareapower {
//员工辖区权限
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

}
