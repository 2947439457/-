package com.zhibang.model;

import java.io.Serializable;

public class SyMetertype implements Serializable {
//水表型号
  private static final long serialVersionUID = 3985071759069503545L;
  private Integer id;
  private String meterTypeName;//水表型号名称
  private Integer aperture;//口径
  private Integer mavValue;//最大表码值
  private Integer minValue;//最小表码值
  private Integer life;//周捡年限
  private String remark;//备注
  private Boolean disabled;//是否禁用


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


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "SyMetertype{" +
            "id=" + id +
            ", meterTypeName='" + meterTypeName + '\'' +
            ", aperture=" + aperture +
            ", mavValue=" + mavValue +
            ", minValue=" + minValue +
            ", life=" + life +
            ", remark='" + remark + '\'' +
            ", disabled='" + disabled + '\'' +
            '}';
  }
}
