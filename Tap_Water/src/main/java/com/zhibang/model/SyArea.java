package com.zhibang.model;


import java.io.Serializable;

public class SyArea implements Serializable {

  private static final long serialVersionUID = -3137436602725817903L;
  private Integer id;
  private String areaName;
  private String remark;
  private Integer disabled;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Integer getDisabled() {
    return disabled;
  }

  public void setDisabled(Integer disabled) {
    this.disabled = disabled;
  }

}
