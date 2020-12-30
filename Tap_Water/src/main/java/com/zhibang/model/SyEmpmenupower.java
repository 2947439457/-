package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyEmpmenupower implements Serializable {
//员工菜单权限
  private static final long serialVersionUID = -790659245149477400L;
  private Integer id;
  private SyEmp empId;//员工ID
  private SyMenu menuId;//菜单ID


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
