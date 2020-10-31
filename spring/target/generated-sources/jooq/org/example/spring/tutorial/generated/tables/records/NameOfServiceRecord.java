/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.records;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generated.tables.NameOfService;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NameOfServiceRecord extends UpdatableRecordImpl<NameOfServiceRecord> implements Record5<Integer, Integer, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1063237716;

    /**
     * Setter for <code>public.name_of_service.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.name_of_service.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.name_of_service.idd</code>.
     */
    public void setIdd(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.name_of_service.idd</code>.
     */
    @NotNull
    public Integer getIdd() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.name_of_service.type_of_service</code>.
     */
    public void setTypeOfService(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.name_of_service.type_of_service</code>.
     */
    @Size(max = 50)
    public String getTypeOfService() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.name_of_service.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.name_of_service.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.name_of_service.delete_date</code>.
     */
    public void setDeleteDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.name_of_service.delete_date</code>.
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
        return NameOfService.NAME_OF_SERVICE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return NameOfService.NAME_OF_SERVICE.IDD;
    }

    @Override
    public Field<String> field3() {
        return NameOfService.NAME_OF_SERVICE.TYPE_OF_SERVICE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return NameOfService.NAME_OF_SERVICE.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return NameOfService.NAME_OF_SERVICE.DELETE_DATE;
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
        return getTypeOfService();
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
        return getTypeOfService();
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
    public NameOfServiceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public NameOfServiceRecord value2(Integer value) {
        setIdd(value);
        return this;
    }

    @Override
    public NameOfServiceRecord value3(String value) {
        setTypeOfService(value);
        return this;
    }

    @Override
    public NameOfServiceRecord value4(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public NameOfServiceRecord value5(LocalDateTime value) {
        setDeleteDate(value);
        return this;
    }

    @Override
    public NameOfServiceRecord values(Integer value1, Integer value2, String value3, LocalDateTime value4, LocalDateTime value5) {
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
     * Create a detached NameOfServiceRecord
     */
    public NameOfServiceRecord() {
        super(NameOfService.NAME_OF_SERVICE);
    }

    /**
     * Create a detached, initialised NameOfServiceRecord
     */
    public NameOfServiceRecord(Integer id, Integer idd, String typeOfService, LocalDateTime createDate, LocalDateTime deleteDate) {
        super(NameOfService.NAME_OF_SERVICE);

        set(0, id);
        set(1, idd);
        set(2, typeOfService);
        set(3, createDate);
        set(4, deleteDate);
    }
}
