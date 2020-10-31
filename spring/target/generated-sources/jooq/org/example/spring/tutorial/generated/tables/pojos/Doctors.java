/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generate.JooqBs;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Doctors implements JooqBs, Serializable {

    private static final long serialVersionUID = 1481030057;

    private Integer       id;
    private Integer       idd;
    private Integer       employeeCode;
    private String        name;
    private Integer       positionId;
    private Integer       cabinetNumber;
    private Integer       timeOfReceiptId;
    private Integer       typeOfServiceId;
    private LocalDateTime createDate;
    private LocalDateTime deleteDate;

    public Doctors() {}

    public Doctors(Doctors value) {
        this.id = value.id;
        this.idd = value.idd;
        this.employeeCode = value.employeeCode;
        this.name = value.name;
        this.positionId = value.positionId;
        this.cabinetNumber = value.cabinetNumber;
        this.timeOfReceiptId = value.timeOfReceiptId;
        this.typeOfServiceId = value.typeOfServiceId;
        this.createDate = value.createDate;
        this.deleteDate = value.deleteDate;
    }

    public Doctors(
        Integer       id,
        Integer       idd,
        Integer       employeeCode,
        String        name,
        Integer       positionId,
        Integer       cabinetNumber,
        Integer       timeOfReceiptId,
        Integer       typeOfServiceId,
        LocalDateTime createDate,
        LocalDateTime deleteDate
    ) {
        this.id = id;
        this.idd = idd;
        this.employeeCode = employeeCode;
        this.name = name;
        this.positionId = positionId;
        this.cabinetNumber = cabinetNumber;
        this.timeOfReceiptId = timeOfReceiptId;
        this.typeOfServiceId = typeOfServiceId;
        this.createDate = createDate;
        this.deleteDate = deleteDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public Integer getIdd() {
        return this.idd;
    }

    public void setIdd(Integer idd) {
        this.idd = idd;
    }

    public Integer getEmployeeCode() {
        return this.employeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Size(max = 20)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getCabinetNumber() {
        return this.cabinetNumber;
    }

    public void setCabinetNumber(Integer cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public Integer getTimeOfReceiptId() {
        return this.timeOfReceiptId;
    }

    public void setTimeOfReceiptId(Integer timeOfReceiptId) {
        this.timeOfReceiptId = timeOfReceiptId;
    }

    public Integer getTypeOfServiceId() {
        return this.typeOfServiceId;
    }

    public void setTypeOfServiceId(Integer typeOfServiceId) {
        this.typeOfServiceId = typeOfServiceId;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getDeleteDate() {
        return this.deleteDate;
    }

    public void setDeleteDate(LocalDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Doctors (");

        sb.append(id);
        sb.append(", ").append(idd);
        sb.append(", ").append(employeeCode);
        sb.append(", ").append(name);
        sb.append(", ").append(positionId);
        sb.append(", ").append(cabinetNumber);
        sb.append(", ").append(timeOfReceiptId);
        sb.append(", ").append(typeOfServiceId);
        sb.append(", ").append(createDate);
        sb.append(", ").append(deleteDate);

        sb.append(")");
        return sb.toString();
    }
}