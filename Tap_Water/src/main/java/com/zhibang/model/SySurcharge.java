package com.zhibang.model;

import java.io.Serializable;

public class SySurcharge implements Serializable {

  private static final long serialVersionUID = 9037354444996853656L;
  private Integer id;
  private Integer surchargeId;
  private Integer waterTypeId;


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
