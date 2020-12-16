package com.zhibang.model;

public class SyCosttype {
//费用类型
  private Integer id;
  private Integer kind;//类型
  private String code;//编码
  private String costTypeName;//费用类型名称
  private String fullName;//费用类型全称
  private Double peice;//单价(元)
  private String surchargeText;//附加费征收范围说明文字（缓存，仅有参考意义）
  private String remark;//备注
  private String disabled;//禁用


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getKind() {
    return kind;
  }

  public void setKind(Integer kind) {
    this.kind = kind;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getCostTypeName() {
    return costTypeName;
  }

  public void setCostTypeName(String costTypeName) {
    this.costTypeName = costTypeName;
  }


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public Double getPeice() {
    return peice;
  }

  public void setPeice(Double peice) {
    this.peice = peice;
  }


  public String getSurchargeText() {
    return surchargeText;
  }

  public void setSurchargeText(String surchargeText) {
    this.surchargeText = surchargeText;
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
