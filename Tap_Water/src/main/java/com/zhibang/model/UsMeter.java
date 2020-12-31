package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class UsMeter implements Serializable {

  private static final long serialVersionUID = -1888011757139819223L;
  private String meterNo;
  private UsUser userNo;
  private String meterName;
  private SyMetertype meterTypeId;
  private Integer maxValue;
  private Integer startValue;
  private Date setupDate;
  private String factory;
  private Boolean disabled;

  public String getMeterNo() {
    return meterNo;
  }

  public void setMeterNo(String meterNo) {
    this.meterNo = meterNo;
  }

  public UsUser getUserNo() {
    return userNo;
  }

  public void setUserNo(UsUser userNo) {
    this.userNo = userNo;
  }

  public String getMeterName() {
    return meterName;
  }

  public void setMeterName(String meterName) {
    this.meterName = meterName;
  }

  public SyMetertype getMeterTypeId() {
    return meterTypeId;
  }

  public void setMeterTypeId(SyMetertype meterTypeId) {
    this.meterTypeId = meterTypeId;
  }

  public Integer getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Integer maxValue) {
    this.maxValue = maxValue;
  }

  public Integer getStartValue() {
    return startValue;
  }

  public void setStartValue(Integer startValue) {
    this.startValue = startValue;
  }

  public Date getSetupDate() {
    return setupDate;
  }

  public void setSetupDate(Date setupDate) {
    this.setupDate = setupDate;
  }

  public String getFactory() {
    return factory;
  }

  public void setFactory(String factory) {
    this.factory = factory;
  }

  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "UsMeter{" +
            "meterNo='" + meterNo + '\'' +
            ", userNo=" + userNo +
            ", meterName='" + meterName + '\'' +
            ", meterTypeId=" + meterTypeId +
            ", maxValue=" + maxValue +
            ", startValue=" + startValue +
            ", setupDate=" + setupDate +
            ", factory='" + factory + '\'' +
            ", disabled=" + disabled +
            '}';
  }
}
