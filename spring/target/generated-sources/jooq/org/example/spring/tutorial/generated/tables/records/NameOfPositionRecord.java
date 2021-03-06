/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.records;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generated.tables.NameOfPosition;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NameOfPositionRecord extends UpdatableRecordImpl<NameOfPositionRecord> implements Record7<Integer, Integer, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1839250817;

    /**
     * Setter for <code>public.name_of_position.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.name_of_position.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.name_of_position.idd</code>.
     */
    public void setIdd(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.name_of_position.idd</code>.
     */
    @NotNull
    public Integer getIdd() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.name_of_position.position</code>.
     */
    public void setPosition(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.name_of_position.position</code>.
     */
    @Size(max = 20)
    public String getPosition() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.name_of_position.salary</code>.
     */
    public void setSalary(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.name_of_position.salary</code>.
     */
    @Size(max = 20)
    public String getSalary() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.name_of_position.premium</code>.
     */
    public void setPremium(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.name_of_position.premium</code>.
     */
    @Size(max = 20)
    public String getPremium() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.name_of_position.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.name_of_position.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.name_of_position.delete_date</code>.
     */
    public void setDeleteDate(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.name_of_position.delete_date</code>.
     */
    public LocalDateTime getDeleteDate() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Integer, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return NameOfPosition.NAME_OF_POSITION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return NameOfPosition.NAME_OF_POSITION.IDD;
    }

    @Override
    public Field<String> field3() {
        return NameOfPosition.NAME_OF_POSITION.POSITION;
    }

    @Override
    public Field<String> field4() {
        return NameOfPosition.NAME_OF_POSITION.SALARY;
    }

    @Override
    public Field<String> field5() {
        return NameOfPosition.NAME_OF_POSITION.PREMIUM;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return NameOfPosition.NAME_OF_POSITION.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return NameOfPosition.NAME_OF_POSITION.DELETE_DATE;
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
    public String component3() {
        return getPosition();
    }

    @Override
    public String component4() {
        return getSalary();
    }

    @Override
    public String component5() {
        return getPremium();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component7() {
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
    public String value3() {
        return getPosition();
    }

    @Override
    public String value4() {
        return getSalary();
    }

    @Override
    public String value5() {
        return getPremium();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value7() {
        return getDeleteDate();
    }

    @Override
    public NameOfPositionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public NameOfPositionRecord value2(Integer value) {
        setIdd(value);
        return this;
    }

    @Override
    public NameOfPositionRecord value3(String value) {
        setPosition(value);
        return this;
    }

    @Override
    public NameOfPositionRecord value4(String value) {
        setSalary(value);
        return this;
    }

    @Override
    public NameOfPositionRecord value5(String value) {
        setPremium(value);
        return this;
    }

    @Override
    public NameOfPositionRecord value6(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public NameOfPositionRecord value7(LocalDateTime value) {
        setDeleteDate(value);
        return this;
    }

    @Override
    public NameOfPositionRecord values(Integer value1, Integer value2, String value3, String value4, String value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NameOfPositionRecord
     */
    public NameOfPositionRecord() {
        super(NameOfPosition.NAME_OF_POSITION);
    }

    /**
     * Create a detached, initialised NameOfPositionRecord
     */
    public NameOfPositionRecord(Integer id, Integer idd, String position, String salary, String premium, LocalDateTime createDate, LocalDateTime deleteDate) {
        super(NameOfPosition.NAME_OF_POSITION);

        set(0, id);
        set(1, idd);
        set(2, position);
        set(3, salary);
        set(4, premium);
        set(5, createDate);
        set(6, deleteDate);
    }
}
