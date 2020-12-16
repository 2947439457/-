package com.zhibang.model;

import java.io.Serializable;
import java.util.Date;

public class UsUser implements Serializable {

  private static final long serialVersionUID = 8248024855748530967L;
  private String userNo;
  private String userName;
  private String abc;
  private Date createDate;
  private String address;
  private String phone;
  private Integer areaId;
  private String userType;
  private String payType;
  private String bankName;
  private String bankNum;
  private String formula;
  private Double userMoney;
  private Integer meterId;
  private String docNum;
  private String contractNum;
  private Date contractDate;
  private Integer volumeId;
  private Integer volumeOrderIndex;
  private Boolean disabled;


  public String getUserNo() {
    return userNo;
  }

  public void setUserNo(String userNo) {
    this.userNo = userNo;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getAbc() {
    return abc;
  }

  public void setAbc(String abc) {
    this.abc = abc;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Integer getAreaId() {
    return areaId;
  }

  public void setAreaId(Integer areaId) {
    this.areaId = areaId;
  }


  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }


  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public String getBankNum() {
    return bankNum;
  }

  public void setBankNum(String bankNum) {
    this.bankNum = bankNum;
  }


  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }


  public Double getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(Double userMoney) {
    this.userMoney = userMoney;
  }


  public Integer getMeterId() {
    return meterId;
  }

  public void setMeterId(Integer meterId) {
    this.meterId = meterId;
  }


  public String getDocNum() {
    return docNum;
  }

  public void setDocNum(String docNum) {
    this.docNum = docNum;
  }


  public String getContractNum() {
    return contractNum;
  }

  public void setContractNum(String contractNum) {
    this.contractNum = contractNum;
  }


  public Date getContractDate() {
    return contractDate;
  }

  public void setContractDate(Date contractDate) {
    this.contractDate = contractDate;
  }


  public Integer getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(Integer volumeId) {
    this.volumeId = volumeId;
  }


  public Integer getVolumeOrderIndex() {
    return volumeOrderIndex;
  }

  public void setVolumeOrderIndex(Integer volumeOrderIndex) {
    this.volumeOrderIndex = volumeOrderIndex;
  }


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  @Override
  public String toString() {
    return "UsUser{" +
            "userNo='" + userNo + '\'' +
            ", userName='" + userName + '\'' +
            ", abc='" + abc + '\'' +
            ", createDate=" + createDate +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            ", areaId=" + areaId +
            ", userType='" + userType + '\'' +
            ", payType='" + payType + '\'' +
            ", bankName='" + bankName + '\'' +
            ", bankNum='" + bankNum + '\'' +
            ", formula='" + formula + '\'' +
            ", userMoney=" + userMoney +
            ", meterId=" + meterId +
            ", docNum='" + docNum + '\'' +
            ", contractNum='" + contractNum + '\'' +
            ", contractDate=" + contractDate +
            ", volumeId=" + volumeId +
            ", volumeOrderIndex=" + volumeOrderIndex +
            ", disabled=" + disabled +
            '}';
  }
}
