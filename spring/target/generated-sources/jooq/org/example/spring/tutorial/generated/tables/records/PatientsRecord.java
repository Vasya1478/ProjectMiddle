/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.records;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generated.tables.Patients;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientsRecord extends UpdatableRecordImpl<PatientsRecord> implements Record10<Integer, Integer, Integer, String, Integer, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1792270626;

    /**
     * Setter for <code>public.patients.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.patients.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.patients.idd</code>.
     */
    public void setIdd(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.patients.idd</code>.
     */
    @NotNull
    public Integer getIdd() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.patients.card_number</code>.
     */
    public void setCardNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.patients.card_number</code>.
     */
    public Integer getCardNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.patients.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.patients.name</code>.
     */
    @Size(max = 20)
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.patients.age</code>.
     */
    public void setAge(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.patients.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.patients.address</code>.
     */
    public void setAddress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.patients.address</code>.
     */
    @Size(max = 50)
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.patients.insurance_number</code>.
     */
    public void setInsuranceNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.patients.insurance_number</code>.
     */
    @Size(max = 10)
    public String getInsuranceNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.patients.phone_number</code>.
     */
    public void setPhoneNumber(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.patients.phone_number</code>.
     */
    @Size(max = 11)
    public String getPhoneNumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.patients.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.patients.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>public.patients.delete_date</code>.
     */
    public void setDeleteDate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.patients.delete_date</code>.
     */
    public LocalDateTime getDeleteDate() {
        return (LocalDateTime) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, Integer, String, Integer, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, Integer, Integer, String, Integer, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Patients.PATIENTS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Patients.PATIENTS.IDD;
    }

    @Override
    public Field<Integer> field3() {
        return Patients.PATIENTS.CARD_NUMBER;
    }

    @Override
    public Field<String> field4() {
        return Patients.PATIENTS.NAME;
    }

    @Override
    public Field<Integer> field5() {
        return Patients.PATIENTS.AGE;
    }

    @Override
    public Field<String> field6() {
        return Patients.PATIENTS.ADDRESS;
    }

    @Override
    public Field<String> field7() {
        return Patients.PATIENTS.INSURANCE_NUMBER;
    }

    @Override
    public Field<String> field8() {
        return Patients.PATIENTS.PHONE_NUMBER;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Patients.PATIENTS.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return Patients.PATIENTS.DELETE_DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getIdd();
    }

    @Override
    public Integer component3() {
        return getCardNumber();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Integer component5() {
        return getAge();
    }

    @Override
    public String component6() {
        return getAddress();
    }

    @Override
    public String component7() {
        return getInsuranceNumber();
    }

    @Override
    public String component8() {
        return getPhoneNumber();
    }

    @Override
    public LocalDateTime component9() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component10() {
        return getDeleteDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getIdd();
    }

    @Override
    public Integer value3() {
        return getCardNumber();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Integer value5() {
        return getAge();
    }

    @Override
    public String value6() {
        return getAddress();
    }

    @Override
    public String value7() {
        return getInsuranceNumber();
    }

    @Override
    public String value8() {
        return getPhoneNumber();
    }

    @Override
    public LocalDateTime value9() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value10() {
        return getDeleteDate();
    }

    @Override
    public PatientsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PatientsRecord value2(Integer value) {
        setIdd(value);
        return this;
    }

    @Override
    public PatientsRecord value3(Integer value) {
        setCardNumber(value);
        return this;
    }

    @Override
    public PatientsRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public PatientsRecord value5(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public PatientsRecord value6(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public PatientsRecord value7(String value) {
        setInsuranceNumber(value);
        return this;
    }

    @Override
    public PatientsRecord value8(String value) {
        setPhoneNumber(value);
        return this;
    }

    @Override
    public PatientsRecord value9(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public PatientsRecord value10(LocalDateTime value) {
        setDeleteDate(value);
        return this;
    }

    @Override
    public PatientsRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, String value6, String value7, String value8, LocalDateTime value9, LocalDateTime value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PatientsRecord
     */
    public PatientsRecord() {
        super(Patients.PATIENTS);
    }

    /**
     * Create a detached, initialised PatientsRecord
     */
    public PatientsRecord(Integer id, Integer idd, Integer cardNumber, String name, Integer age, String address, String insuranceNumber, String phoneNumber, LocalDateTime createDate, LocalDateTime deleteDate) {
        super(Patients.PATIENTS);

        set(0, id);
        set(1, idd);
        set(2, cardNumber);
        set(3, name);
        set(4, age);
        set(5, address);
        set(6, insuranceNumber);
        set(7, phoneNumber);
        set(8, createDate);
        set(9, deleteDate);
    }
}
