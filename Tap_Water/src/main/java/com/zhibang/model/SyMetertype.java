package com.zhibang.model;

import java.io.Serializable;

public class SyMetertype implements Serializable {

  private static final long serialVersionUID = 3985071759069503545L;
  private Integer id;
  private String meterTypeName;
  private Integer aperture;
  private Integer mavValue;
  private Integer minValue;
  private Integer life;
  private String remark;
  private String disabled;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getMeterTypeName() {
    return meterTypeName;
  }

  public void setMeterTypeName(String meterTypeName) {
    this.meterTypeName = meterTypeName;
  }


  public Integer getAperture() {
    return aperture;
  }

  public void setAperture(Integer aperture) {
    this.aperture = aperture;
  }


  public Integer getMavValue() {
    return mavValue;
  }

  public void setMavValue(Integer mavValue) {
    this.mavValue = mavValue;
  }


  public Integer getMinValue() {
    return minValue;
  }

  public void setMinValue(Integer minValue) {
    this.minValue = minValue;
  }


  public Integer getLife() {
    return life;
  }

  public void setLife(Integer life) {
    this.life = life;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

}
