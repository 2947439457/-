package com.zhibang.model;

import java.io.Serializable;

public class RdTask implements Serializable {

  private static final long serialVersionUID = 2632365192207834537L;
  private Integer id;
  private Integer readYear;
  private Integer readMonth;
  private Integer volumeId;
  private Integer empId;


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


  public Integer getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(Integer volumeId) {
    this.volumeId = volumeId;
  }


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }

  @Override
  public String toString() {
    return "RdTask{" +
            "id=" + id +
            ", readYear=" + readYear +
            ", readMonth=" + readMonth +
            ", volumeId=" + volumeId +
            ", empId=" + empId +
            '}';
  }
}
