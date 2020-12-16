package com.zhibang.model;

import java.io.Serializable;
import java.util.Date;
public class RdYearmonth implements Serializable {

  private static final long serialVersionUID = 3050014190925294717L;
  private Integer id;
  private Integer readYear;
  private Integer readMonth;
  private Boolean isCurrent;
  private SyEmp initEmpId;
  private Date initDate;
  private Date endDate;

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

  public Boolean getCurrent() {
    return isCurrent;
  }

  public void setCurrent(Boolean current) {
    isCurrent = current;
  }

  public SyEmp getInitEmpId() {
    return initEmpId;
  }

  public void setInitEmpId(SyEmp initEmpId) {
    this.initEmpId = initEmpId;
  }

  public Date getInitDate() {
    return initDate;
  }

  public void setInitDate(Date initDate) {
    this.initDate = initDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "RdYearmonth{" +
            "id=" + id +
            ", readYear=" + readYear +
            ", readMonth=" + readMonth +
            ", isCurrent=" + isCurrent +
            ", initEmpId=" + initEmpId +
            ", initDate=" + initDate +
            ", endDate=" + endDate +
            '}';
  }
}
