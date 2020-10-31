/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.records;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generated.tables.Services;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServicesRecord extends UpdatableRecordImpl<ServicesRecord> implements Record9<Integer, Integer, Integer, String, Integer, String, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1613130530;

    /**
     * Setter for <code>public.services.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.services.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.services.idd</code>.
     */
    public void setIdd(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.services.idd</code>.
     */
    @NotNull
    public Integer getIdd() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.services.number</code>.
     */
    public void setNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.services.number</code>.
     */
    @NotNull
    public Integer getNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.services.service_name</code>.
     */
    public void setServiceName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.services.service_name</code>.
     */
    @Size(max = 100)
    public String getServiceName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.services.type_of_service_id</code>.
     */
    public void setTypeOfServiceId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.services.type_of_service_id</code>.
     */
    public Integer getTypeOfServiceId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.services.price</code>.
     */
    public void setPrice(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.services.price</code>.
     */
    @Size(max = 20)
    public String getPrice() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.services.discount</code>.
     */
    public void setDiscount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.services.discount</code>.
     */
    public Integer getDiscount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.services.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.services.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.services.delete_date</code>.
     */
    public void setDeleteDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.services.delete_date</code>.
     */
    public LocalDateTime getDeleteDate() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, String, Integer, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, Integer, String, Integer, String, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Services.SERVICES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Services.SERVICES.IDD;
    }

    @Override
    public Field<Integer> field3() {
        return Services.SERVICES.NUMBER;
    }

    @Override
    public Field<String> field4() {
        return Services.SERVICES.SERVICE_NAME;
    }

    @Override
    public Field<Integer> field5() {
        return Services.SERVICES.TYPE_OF_SERVICE_ID;
    }

    @Override
    public Field<String> field6() {
        return Services.SERVICES.PRICE;
    }

    @Override
    public Field<Integer> field7() {
        return Services.SERVICES.DISCOUNT;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Services.SERVICES.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Services.SERVICES.DELETE_DATE;
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
        return getNumber();
    }

    @Override
    public String component4() {
        return getServiceName();
    }

    @Override
    public Integer component5() {
        return getTypeOfServiceId();
    }

    @Override
    public String component6() {
        return getPrice();
    }

    @Override
    public Integer component7() {
        return getDiscount();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component9() {
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
        return getNumber();
    }

    @Override
    public String value4() {
        return getServiceName();
    }

    @Override
    public Integer value5() {
        return getTypeOfServiceId();
    }

    @Override
    public String value6() {
        return getPrice();
    }

    @Override
    public Integer value7() {
        return getDiscount();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value9() {
        return getDeleteDate();
    }

    @Override
    public ServicesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ServicesRecord value2(Integer value) {
        setIdd(value);
        return this;
    }

    @Override
    public ServicesRecord value3(Integer value) {
        setNumber(value);
        return this;
    }

    @Override
    public ServicesRecord value4(String value) {
        setServiceName(value);
        return this;
    }

    @Override
    public ServicesRecord value5(Integer value) {
        setTypeOfServiceId(value);
        return this;
    }

    @Override
    public ServicesRecord value6(String value) {
        setPrice(value);
        return this;
    }

    @Override
    public ServicesRecord value7(Integer value) {
        setDiscount(value);
        return this;
    }

    @Override
    public ServicesRecord value8(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public ServicesRecord value9(LocalDateTime value) {
        setDeleteDate(value);
        return this;
    }

    @Override
    public ServicesRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, String value6, Integer value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServicesRecord
     */
    public ServicesRecord() {
        super(Services.SERVICES);
    }

    /**
     * Create a detached, initialised ServicesRecord
     */
    public ServicesRecord(Integer id, Integer idd, Integer number, String serviceName, Integer typeOfServiceId, String price, Integer discount, LocalDateTime createDate, LocalDateTime deleteDate) {
        super(Services.SERVICES);

        set(0, id);
        set(1, idd);
        set(2, number);
        set(3, serviceName);
        set(4, typeOfServiceId);
        set(5, price);
        set(6, discount);
        set(7, createDate);
        set(8, deleteDate);
    }
}