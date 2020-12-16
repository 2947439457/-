package com.zhibang.model;

public class SyEmpmenupower {
//员工菜单权限
  private Integer id;
  private Integer empId;//员工ID
  private Integer menuId;//菜单ID


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
