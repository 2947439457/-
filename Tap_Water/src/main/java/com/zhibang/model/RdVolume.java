package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class RdVolume implements Serializable {

  private static final long serialVersionUID = -6111071383753928798L;
  private Integer id;
  private String volumeName;
  private SyArea areaId;//辖区对象
  private Integer orderIndex;//排列序号
  private String remark;//备注
  private Boolean disabled;//状态：FALSE表示可用  TRUE表示禁用

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public SyArea getAreaId() {
    return areaId;
  }

  public void setAreaId(SyArea areaId) {
    this.areaId = areaId;
  }

  public Integer getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Integer orderIndex) {
    this.orderIndex = orderIndex;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "RdVolume{" +
            "id=" + id +
            ", volumeName='" + volumeName + '\'' +
            ", areaId=" + areaId +
            ", orderIndex=" + orderIndex +
            ", remark='" + remark + '\'' +
            ", disabled=" + disabled +
            '}';
  }
}
