package com.zhibang.model;

public class UsMeter {

  private String meterNo;
  private String userNo;
  private String meterName;
  private Integer meterTypeId;
  private Integer maxValue;
  private Integer startValue;
  private java.sql.Timestamp setupDate;
  private String factory;
  private String disabled;


  public String getMeterNo() {
    return meterNo;
  }

  public void setMeterNo(String meterNo) {
    this.meterNo = meterNo;
  }


  public String getUserNo() {
    return userNo;
  }

  public void setUserNo(String userNo) {
    this.userNo = userNo;
  }


  public String getMeterName() {
    return meterName;
  }

  public void setMeterName(String meterName) {
    this.meterName = meterName;
  }


  public Integer getMeterTypeId() {
    return meterTypeId;
  }

  public void setMeterTypeId(Integer meterTypeId) {
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


  public java.sql.Timestamp getSetupDate() {
    return setupDate;
  }

  public void setSetupDate(java.sql.Timestamp setupDate) {
    this.setupDate = setupDate;
  }


  public String getFactory() {
    return factory;
  }

  public void setFactory(String factory) {
    this.factory = factory;
  }


  public String getDisabled() {
    return disabled;
  }

  public void setDisabled(String disabled) {
    this.disabled = disabled;
  }

}
