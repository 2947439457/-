package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BeFormula implements Serializable {

  private static final long serialVersionUID = -1020824390258308756L;
  private Integer id;
  private BeOrderuser orderUserId;
  private String waterTypeCode;
  private String allotText;
  private Integer allotType;
  private Integer allotValue;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BeOrderuser getOrderUserId() {
    return orderUserId;
  }

  public void setOrderUserId(BeOrderuser orderUserId) {
    this.orderUserId = orderUserId;
  }

  public String getWaterTypeCode() {
    return waterTypeCode;
  }

  public void setWaterTypeCode(String waterTypeCode) {
    this.waterTypeCode = waterTypeCode;
  }

  public String getAllotText() {
    return allotText;
  }

  public void setAllotText(String allotText) {
    this.allotText = allotText;
  }

  public Integer getAllotType() {
    return allotType;
  }

  public void setAllotType(Integer allotType) {
    this.allotType = allotType;
  }

  public Integer getAllotValue() {
    return allotValue;
  }

  public void setAllotValue(Integer allotValue) {
    this.allotValue = allotValue;
  }

  @Override
  public String toString() {
    return "BeFormula{" +
            "id=" + id +
            ", orderUserId=" + orderUserId +
            ", waterTypeCode='" + waterTypeCode + '\'' +
            ", allotText='" + allotText + '\'' +
            ", allotType=" + allotType +
            ", allotValue=" + allotValue +
            '}';
  }
}
