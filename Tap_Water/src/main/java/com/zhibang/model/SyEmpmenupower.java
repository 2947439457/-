package com.zhibang.model;

import java.io.Serializable;

public class SyEmpmenupower implements Serializable {

  private static final long serialVersionUID = -790659245149477400L;
  private Integer id;
  private Integer empId;
  private Integer menuId;


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


  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

}
