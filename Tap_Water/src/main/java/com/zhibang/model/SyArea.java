package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyArea implements Serializable {
//抄表辖区
  private static final long serialVersionUID = -3137436602725817903L;
  private Integer id;
  private String areaName;//抄表辖区名称
  private String remark;//备注
  private Integer disabled;//是否禁用


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
    @Override
    public String toString() {
        return "SyArea{" +
                "id=" + id +
                ", areaName='" + areaName + '\'' +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}
