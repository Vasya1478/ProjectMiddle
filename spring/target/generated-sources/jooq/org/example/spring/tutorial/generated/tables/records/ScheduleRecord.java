/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.records;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generated.tables.Schedule;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScheduleRecord extends UpdatableRecordImpl<ScheduleRecord> implements Record5<Integer, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -454870488;

    /**
     * Setter for <code>public.schedule.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.schedule.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.schedule.idd</code>.
     */
    public void setIdd(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.schedule.idd</code>.
     */
    @NotNull
    public Integer getIdd() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.schedule.time_of_receipt</code>.
     */
    public void setTimeOfReceipt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.schedule.time_of_receipt</code>.
     */
    @Size(max = 12)
    public String getTimeOfReceipt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.schedule.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.schedule.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.schedule.delete_date</code>.
     */
    public void setDeleteDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.schedule.delete_date</code>.
     */
    public LocalDateTime getDeleteDate() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Schedule.SCHEDULE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Schedule.SCHEDULE.IDD;
    }

    @Override
    public Field<String> field3() {
        return Schedule.SCHEDULE.TIME_OF_RECEIPT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Schedule.SCHEDULE.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Schedule.SCHEDULE.DELETE_DATE;
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
        return getTimeOfReceipt();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component5() {
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
        return getTimeOfReceipt();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value5() {
        return getDeleteDate();
    }

    @Override
    public ScheduleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ScheduleRecord value2(Integer value) {
        setIdd(value);
        return this;
    }

    @Override
    public ScheduleRecord value3(String value) {
        setTimeOfReceipt(value);
        return this;
    }

    @Override
    public ScheduleRecord value4(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public ScheduleRecord value5(LocalDateTime value) {
        setDeleteDate(value);
        return this;
    }

    @Override
    public ScheduleRecord values(Integer value1, Integer value2, String value3, LocalDateTime value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScheduleRecord
     */
    public ScheduleRecord() {
        super(Schedule.SCHEDULE);
    }

    /**
     * Create a detached, initialised ScheduleRecord
     */
    public ScheduleRecord(Integer id, Integer idd, String timeOfReceipt, LocalDateTime createDate, LocalDateTime deleteDate) {
        super(Schedule.SCHEDULE);

        set(0, id);
        set(1, idd);
        set(2, timeOfReceipt);
        set(3, createDate);
        set(4, deleteDate);
    }
}
