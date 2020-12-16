package com.zhibang.model;

public class SySurcharge {
//附加费关联
  private Integer id;
  private Integer surchargeId;//附加符ID
  private Integer waterTypeId;//用水类型ID


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getSurchargeId() {
    return surchargeId;
  }

  public void setSurchargeId(Integer surchargeId) {
    this.surchargeId = surchargeId;
  }


  public Integer getWaterTypeId() {
    return waterTypeId;
  }

  public void setWaterTypeId(Integer waterTypeId) {
    this.waterTypeId = waterTypeId;
  }

}
