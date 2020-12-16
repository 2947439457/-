package com.zhibang.model;

import java.io.Serializable;

public class SyMenu implements Serializable {
//菜单
  private static final long serialVersionUID = -881596635153393790L;
  private Integer id;
  private String menuName;//菜单名称
  private String parent;//菜单上级ID
  private Integer orderIndex;//菜单链接的URL
  private Integer flowId;//此菜单项对应业扩流程中的流程ID
  private Boolean disabled;//是否禁用


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }


  public Integer getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Integer orderIndex) {
    this.orderIndex = orderIndex;
  }


  public Integer getFlowId() {
    return flowId;
  }

  public void setFlowId(Integer flowId) {
    this.flowId = flowId;
  }


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "SyMenu{" +
            "id=" + id +
            ", menuName='" + menuName + '\'' +
            ", parent='" + parent + '\'' +
            ", orderIndex=" + orderIndex +
            ", flowId=" + flowId +
            ", disabled='" + disabled + '\'' +
            '}';
  }
}
