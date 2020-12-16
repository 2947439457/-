package com.zhibang.model;

import java.io.Serializable;
import java.util.Date;
public class RdRead implements Serializable {

  private static final long serialVersionUID = -7760181010395207682L;
  private Integer id;
  private Integer readYear;
  private Integer readMonth;
  private String userNo;
  private String meterNo;
  private Integer maxValue;
  private Integer volumeId;
  private Integer volumeIndex;
  private Integer readEmpId;
  private Date readDate;
  private Integer preValue;
  private Boolean enter;
  private Integer curValue;
  private Boolean dial;
  private Integer amount;
  private String formula;
  private String audit;
  private Integer auditEmpId;
  private Date auditDate;


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


  public String getUserNo() {
    return userNo;
  }

  public void setUserNo(String userNo) {
    this.userNo = userNo;
  }


  public String getMeterNo() {
    return meterNo;
  }

  public void setMeterNo(String meterNo) {
    this.meterNo = meterNo;
  }


  public Integer getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Integer maxValue) {
    this.maxValue = maxValue;
  }


  public Integer getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(Integer volumeId) {
    this.volumeId = volumeId;
  }


  public Integer getVolumeIndex() {
    return volumeIndex;
  }

  public void setVolumeIndex(Integer volumeIndex) {
    this.volumeIndex = volumeIndex;
  }


  public Integer getReadEmpId() {
    return readEmpId;
  }

  public void setReadEmpId(Integer readEmpId) {
    this.readEmpId = readEmpId;
  }


  public Date getReadDate() {
    return readDate;
  }

  public void setReadDate(Date readDate) {
    this.readDate = readDate;
  }


  public Integer getPreValue() {
    return preValue;
  }

  public void setPreValue(Integer preValue) {
    this.preValue = preValue;
  }


  public Boolean getEnter() {
    return enter;
  }

  public void setEnter(Boolean enter) {
    this.enter = enter;
  }


  public Integer getCurValue() {
    return curValue;
  }

  public void setCurValue(Integer curValue) {
    this.curValue = curValue;
  }


  public Boolean getDial() {
    return dial;
  }

  public void setDial(Boolean dial) {
    this.dial = dial;
  }


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }


  public String getAudit() {
    return audit;
  }

  public void setAudit(String audit) {
    this.audit = audit;
  }


  public Integer getAuditEmpId() {
    return auditEmpId;
  }

  public void setAuditEmpId(Integer auditEmpId) {
    this.auditEmpId = auditEmpId;
  }


  public Date getAuditDate() {
    return auditDate;
  }

  public void setAuditDate(Date auditDate) {
    this.auditDate = auditDate;
  }

  @Override
  public String toString() {
    return "RdRead{" +
            "id=" + id +
            ", readYear=" + readYear +
            ", readMonth=" + readMonth +
            ", userNo='" + userNo + '\'' +
            ", meterNo='" + meterNo + '\'' +
            ", maxValue=" + maxValue +
            ", volumeId=" + volumeId +
            ", volumeIndex=" + volumeIndex +
            ", readEmpId=" + readEmpId +
            ", readDate=" + readDate +
            ", preValue=" + preValue +
            ", enter=" + enter +
            ", curValue=" + curValue +
            ", dial=" + dial +
            ", amount=" + amount +
            ", formula='" + formula + '\'' +
            ", audit='" + audit + '\'' +
            ", auditEmpId=" + auditEmpId +
            ", auditDate=" + auditDate +
            '}';
  }
}
