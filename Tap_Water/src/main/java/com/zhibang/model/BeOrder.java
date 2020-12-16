package com.zhibang.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class BeOrder implements Serializable {

    private static final long serialVersionUID = -1319190645632479513L;
    private String orderNo;
    private Integer orderType;
    private BeFlow stepId;
    private SyEmp createEmp;
    private Date createDate;
    private SyEmp completeEmp;
    private Date completeDate;
    private SyEmp lastEditEmp;
    private Date lastEditDate;
    private String userNo;
    private String useTarget;
    private Integer houseHeight;
    private Integer maxAmount;
    private SyMetertype meterTypeId;
    private Integer meterCount;
    private String userRemark;
    private String oldUserNo;
    private String oldUserName;
    private String oldUserPhone;
    private String oldUserAddr;
    private String oldMeter;
    private SyEmp auditEmpId;
    private String auditMessage;
    private Double projectMoney;
    private Double realMoney;
    private Date payDate;
    private Date projectDate1;
    private Date projectDate2;
    private SyArea areaId;
    private String abortCause;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public BeFlow getStepId() {
        return stepId;
    }

    public void setStepId(BeFlow stepId) {
        this.stepId = stepId;
    }

    public SyEmp getCreateEmp() {
        return createEmp;
    }

    public void setCreateEmp(SyEmp createEmp) {
        this.createEmp = createEmp;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public SyEmp getCompleteEmp() {
        return completeEmp;
    }

    public void setCompleteEmp(SyEmp completeEmp) {
        this.completeEmp = completeEmp;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public SyEmp getLastEditEmp() {
        return lastEditEmp;
    }

    public void setLastEditEmp(SyEmp lastEditEmp) {
        this.lastEditEmp = lastEditEmp;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUseTarget() {
        return useTarget;
    }

    public void setUseTarget(String useTarget) {
        this.useTarget = useTarget;
    }

    public Integer getHouseHeight() {
        return houseHeight;
    }

    public void setHouseHeight(Integer houseHeight) {
        this.houseHeight = houseHeight;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    public SyMetertype getMeterTypeId() {
        return meterTypeId;
    }

    public void setMeterTypeId(SyMetertype meterTypeId) {
        this.meterTypeId = meterTypeId;
    }

    public Integer getMeterCount() {
        return meterCount;
    }

    public void setMeterCount(Integer meterCount) {
        this.meterCount = meterCount;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public String getOldUserNo() {
        return oldUserNo;
    }

    public void setOldUserNo(String oldUserNo) {
        this.oldUserNo = oldUserNo;
    }

    public String getOldUserName() {
        return oldUserName;
    }

    public void setOldUserName(String oldUserName) {
        this.oldUserName = oldUserName;
    }

    public String getOldUserPhone() {
        return oldUserPhone;
    }

    public void setOldUserPhone(String oldUserPhone) {
        this.oldUserPhone = oldUserPhone;
    }

    public String getOldUserAddr() {
        return oldUserAddr;
    }

    public void setOldUserAddr(String oldUserAddr) {
        this.oldUserAddr = oldUserAddr;
    }

    public String getOldMeter() {
        return oldMeter;
    }

    public void setOldMeter(String oldMeter) {
        this.oldMeter = oldMeter;
    }

    public SyEmp getAuditEmpId() {
        return auditEmpId;
    }

    public void setAuditEmpId(SyEmp auditEmpId) {
        this.auditEmpId = auditEmpId;
    }

    public String getAuditMessage() {
        return auditMessage;
    }

    public void setAuditMessage(String auditMessage) {
        this.auditMessage = auditMessage;
    }

    public Double getProjectMoney() {
        return projectMoney;
    }

    public void setProjectMoney(Double projectMoney) {
        this.projectMoney = projectMoney;
    }

    public Double getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(Double realMoney) {
        this.realMoney = realMoney;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getProjectDate1() {
        return projectDate1;
    }

    public void setProjectDate1(Date projectDate1) {
        this.projectDate1 = projectDate1;
    }

    public Date getProjectDate2() {
        return projectDate2;
    }

    public void setProjectDate2(Date projectDate2) {
        this.projectDate2 = projectDate2;
    }

    public SyArea getAreaId() {
        return areaId;
    }

    public void setAreaId(SyArea areaId) {
        this.areaId = areaId;
    }

    public String getAbortCause() {
        return abortCause;
    }

    public void setAbortCause(String abortCause) {
        this.abortCause = abortCause;
    }

    @Override
    public String toString() {
        return "BeOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", orderType=" + orderType +
                ", stepId=" + stepId +
                ", createEmp=" + createEmp +
                ", createDate=" + createDate +
                ", completeEmp=" + completeEmp +
                ", completeDate=" + completeDate +
                ", lastEditEmp=" + lastEditEmp +
                ", lastEditDate=" + lastEditDate +
                ", userNo='" + userNo + '\'' +
                ", useTarget='" + useTarget + '\'' +
                ", houseHeight=" + houseHeight +
                ", maxAmount=" + maxAmount +
                ", meterTypeId=" + meterTypeId +
                ", meterCount=" + meterCount +
                ", userRemark='" + userRemark + '\'' +
                ", oldUserNo='" + oldUserNo + '\'' +
                ", oldUserName='" + oldUserName + '\'' +
                ", oldUserPhone='" + oldUserPhone + '\'' +
                ", oldUserAddr='" + oldUserAddr + '\'' +
                ", oldMeter='" + oldMeter + '\'' +
                ", auditEmpId=" + auditEmpId +
                ", auditMessage='" + auditMessage + '\'' +
                ", projectMoney=" + projectMoney +
                ", realMoney=" + realMoney +
                ", payDate=" + payDate +
                ", projectDate1=" + projectDate1 +
                ", projectDate2=" + projectDate2 +
                ", areaId=" + areaId +
                ", abortCause='" + abortCause + '\'' +
                '}';
    }
}
