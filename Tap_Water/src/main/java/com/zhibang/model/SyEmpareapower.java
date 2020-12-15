package com.zhibang.model;

import java.io.Serializable;

public class SyEmpareapower implements Serializable {

  private static final long serialVersionUID = -2247551956030742021L;
  private Integer id;
  private Integer empId;
  private Integer areaId;


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
