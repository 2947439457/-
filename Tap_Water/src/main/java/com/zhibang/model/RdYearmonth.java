package com.zhibang.model;


public class RdYearmonth {

  private Integer id;
  private Integer readYear;
  private Integer readMonth;
  private String isCurrent;
  private Integer initEmpId;
  private java.sql.Timestamp initDate;
  private java.sql.Timestamp endDate;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getReadYear() {
    return readYear;
  }

  public void setReadYear(Integer readYear) {
    this.readYear = readYear;
  }


  public Integer getReadMonth() {
    return readMonth;
  }

  public void setReadMonth(Integer readMonth) {
    this.readMonth = readMonth;
  }


  public String getIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(String isCurrent) {
    this.isCurrent = isCurrent;
  }


  public Integer getInitEmpId() {
    return initEmpId;
  }

  public void setInitEmpId(Integer initEmpId) {
    this.initEmpId = initEmpId;
  }


  public java.sql.Timestamp getInitDate() {
    return initDate;
  }

  public void setInitDate(java.sql.Timestamp initDate) {
    this.initDate = initDate;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }

}
