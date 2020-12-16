package com.zhibang.model;

import java.io.Serializable;

public class SySurcharge implements Serializable {

  private static final long serialVersionUID = 9037354444996853656L;
  private Integer id;
  private SyCosttype surchargeId;
  private SyCosttype waterTypeId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SyCosttype getSurchargeId() {
    return surchargeId;
  }

  public void setSurchargeId(SyCosttype surchargeId) {
    this.surchargeId = surchargeId;
  }

  public SyCosttype getWaterTypeId() {
    return waterTypeId;
  }

  public void setWaterTypeId(SyCosttype waterTypeId) {
    this.waterTypeId = waterTypeId;
  }

  @Override
  public String toString() {
    return "SySurcharge{" +
            "id=" + id +
            ", surchargeId=" + surchargeId +
            ", waterTypeId=" + waterTypeId +
            '}';
  }
}
