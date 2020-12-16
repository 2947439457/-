package com.zhibang.model;

import java.io.Serializable;

public class SyEmpmenupower implements Serializable {

  private static final long serialVersionUID = -790659245149477400L;
  private Integer id;
  private SyEmp empId;
  private SyMenu menuId;

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

  public SyMenu getMenuId() {
    return menuId;
  }

  public void setMenuId(SyMenu menuId) {
    this.menuId = menuId;
  }

  @Override
  public String toString() {
    return "SyEmpmenupower{" +
            "id=" + id +
            ", empId=" + empId +
            ", menuId=" + menuId +
            '}';
  }
}
