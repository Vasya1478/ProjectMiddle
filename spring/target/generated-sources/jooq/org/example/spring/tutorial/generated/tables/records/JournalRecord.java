/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.records;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.example.spring.tutorial.generated.tables.Journal;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JournalRecord extends UpdatableRecordImpl<JournalRecord> implements Record11<Integer, Integer, String, Integer, String, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -875935990;

    /**
     * Setter for <code>public.journal.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.journal.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.journal.idd</code>.
     */
    public void setIdd(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.journal.idd</code>.
     */
    @NotNull
    public Integer getIdd() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.journal.date_of_receipt</code>.
     */
    public void setDateOfReceipt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.journal.date_of_receipt</code>.
     */
    @Size(max = 20)
    public String getDateOfReceipt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.journal.card_number_id</code>.
     */
    public void setCardNumberId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.journal.card_number_id</code>.
     */
    public Integer getCardNumberId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.journal.patient_name</code>.
     */
    public void setPatientName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.journal.patient_name</code>.
     */
    @Size(max = 20)
    public String getPatientName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.journal.doctor_name_id</code>.
     */
    public void setDoctorNameId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.journal.doctor_name_id</code>.
     */
    public Integer getDoctorNameId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.journal.doctor_post</code>.
     */
    public void setDoctorPost(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.journal.doctor_post</code>.
     */
    public Integer getDoctorPost() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.journal.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.journal.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.journal.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.journal.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.journal.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.journal.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>public.journal.delete_date</code>.
     */
    public void setDeleteDate(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.journal.delete_date</code>.
     */
    public LocalDateTime getDeleteDate() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, Integer, String, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, Integer, String, Integer, String, Integer, Integer, Integer, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Journal.JOURNAL.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Journal.JOURNAL.IDD;
    }

    @Override
    public Field<String> field3() {
        return Journal.JOURNAL.DATE_OF_RECEIPT;
    }

    @Override
    public Field<Integer> field4() {
        return Journal.JOURNAL.CARD_NUMBER_ID;
    }

    @Override
    public Field<String> field5() {
        return Journal.JOURNAL.PATIENT_NAME;
    }

    @Override
    public Field<Integer> field6() {
        return Journal.JOURNAL.DOCTOR_NAME_ID;
    }

    @Override
    public Field<Integer> field7() {
        return Journal.JOURNAL.DOCTOR_POST;
    }

    @Override
    public Field<Integer> field8() {
        return Journal.JOURNAL.SERVICE_ID;
    }

    @Override
    public Field<Integer> field9() {
        return Journal.JOURNAL.QUANTITY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return Journal.JOURNAL.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return Journal.JOURNAL.DELETE_DATE;
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
        return getDateOfReceipt();
    }

    @Override
    public Integer component4() {
        return getCardNumberId();
    }

    @Override
    public String component5() {
        return getPatientName();
    }

    @Override
    public Integer component6() {
        return getDoctorNameId();
    }

    @Override
    public Integer component7() {
        return getDoctorPost();
    }

    @Override
    public Integer component8() {
        return getServiceId();
    }

    @Override
    public Integer component9() {
        return getQuantity();
    }

    @Override
    public LocalDateTime component10() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component11() {
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
        return getDateOfReceipt();
    }

    @Override
    public Integer value4() {
        return getCardNumberId();
    }

    @Override
    public String value5() {
        return getPatientName();
    }

    @Override
    public Integer value6() {
        return getDoctorNameId();
    }

    @Override
    public Integer value7() {
        return getDoctorPost();
    }

    @Override
    public Integer value8() {
        return getServiceId();
    }

    @Override
    public Integer value9() {
        return getQuantity();
    }

    @Override
    public LocalDateTime value10() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value11() {
        return getDeleteDate();
    }

    @Override
    public JournalRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public JournalRecord value2(Integer value) {
        setIdd(value);
        return this;
    }

    @Override
    public JournalRecord value3(String value) {
        setDateOfReceipt(value);
        return this;
    }

    @Override
    public JournalRecord value4(Integer value) {
        setCardNumberId(value);
        return this;
    }

    @Override
    public JournalRecord value5(String value) {
        setPatientName(value);
        return this;
    }

    @Override
    public JournalRecord value6(Integer value) {
        setDoctorNameId(value);
        return this;
    }

    @Override
    public JournalRecord value7(Integer value) {
        setDoctorPost(value);
        return this;
    }

    @Override
    public JournalRecord value8(Integer value) {
        setServiceId(value);
        return this;
    }

    @Override
    public JournalRecord value9(Integer value) {
        setQuantity(value);
        return this;
    }

    @Override
    public JournalRecord value10(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public JournalRecord value11(LocalDateTime value) {
        setDeleteDate(value);
        return this;
    }

    @Override
    public JournalRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, Integer value6, Integer value7, Integer value8, Integer value9, LocalDateTime value10, LocalDateTime value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JournalRecord
     */
    public JournalRecord() {
        super(Journal.JOURNAL);
    }

    /**
     * Create a detached, initialised JournalRecord
     */
    public JournalRecord(Integer id, Integer idd, String dateOfReceipt, Integer cardNumberId, String patientName, Integer doctorNameId, Integer doctorPost, Integer serviceId, Integer quantity, LocalDateTime createDate, LocalDateTime deleteDate) {
        super(Journal.JOURNAL);

        set(0, id);
        set(1, idd);
        set(2, dateOfReceipt);
        set(3, cardNumberId);
        set(4, patientName);
        set(5, doctorNameId);
        set(6, doctorPost);
        set(7, serviceId);
        set(8, quantity);
        set(9, createDate);
        set(10, deleteDate);
    }
}
