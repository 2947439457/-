package com.zhibang.model;


import java.io.Serializable;

public class RdVolume implements Serializable {

  private static final long serialVersionUID = -6111071383753928798L;
  private Integer id;
  private String volumeName;
  private SyArea areaId;
  private Integer orderIndex;
  private String remark;
  private Boolean disabled;

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
