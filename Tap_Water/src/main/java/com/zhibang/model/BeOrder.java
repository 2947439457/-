package com.zhibang.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Component
@Scope(value = "prototype")
public class BeOrder implements Serializable {

    private static final long serialVersionUID = -1319190645632479513L;
    private String orderNo;
    private Integer orderType;
    private BeFlow stepId;
    private SyEmp createEmp;
    private Timestamp createDate;
    private SyEmp completeEmp;
    private Timestamp completeDate;
    private SyEmp lastEditEmp;
    private Timestamp lastEditDate;
    private UsUser userNo;
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
    private Timestamp payDate;
    private Timestamp projectDate1;
    private Timestamp projectDate2;
    private SyArea areaId;
    private String abortCause;

    //将最后修改日期转换“yyyy-MM-dd”:xxy
    public String updateDate(){
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd");
        return sdm.format(lastEditDate);
    }

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

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public SyEmp getCompleteEmp() {
        return completeEmp;
    }

    public void setCompleteEmp(SyEmp completeEmp) {
        this.completeEmp = completeEmp;
    }

    public Timestamp getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Timestamp completeDate) {
        this.completeDate = completeDate;
    }

    public SyEmp getLastEditEmp() {
        return lastEditEmp;
    }

    public void setLastEditEmp(SyEmp lastEditEmp) {
        this.lastEditEmp = lastEditEmp;
    }

    public Timestamp getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Timestamp lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public UsUser getUserNo() {
        return userNo;
    }

    public void setUserNo(UsUser userNo) {
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

    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    public Timestamp getProjectDate1() {
        return projectDate1;
    }

    public void setProjectDate1(Timestamp projectDate1) {
        this.projectDate1 = projectDate1;
    }

    public Timestamp getProjectDate2() {
        return projectDate2;
    }

    public void setProjectDate2(Timestamp projectDate2) {
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
