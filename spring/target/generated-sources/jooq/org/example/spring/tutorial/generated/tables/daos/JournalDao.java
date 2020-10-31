/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;

import org.example.spring.tutorial.generated.tables.Journal;
import org.example.spring.tutorial.generated.tables.records.JournalRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class JournalDao extends DAOImpl<JournalRecord, org.example.spring.tutorial.generated.tables.pojos.Journal, Integer> {

    /**
     * Create a new JournalDao without any configuration
     */
    public JournalDao() {
        super(Journal.JOURNAL, org.example.spring.tutorial.generated.tables.pojos.Journal.class);
    }

    /**
     * Create a new JournalDao with an attached configuration
     */
    @Autowired
    public JournalDao(Configuration configuration) {
        super(Journal.JOURNAL, org.example.spring.tutorial.generated.tables.pojos.Journal.class, configuration);
    }

    @Override
    public Integer getId(org.example.spring.tutorial.generated.tables.pojos.Journal object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchById(Integer... values) {
        return fetch(Journal.JOURNAL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.example.spring.tutorial.generated.tables.pojos.Journal fetchOneById(Integer value) {
        return fetchOne(Journal.JOURNAL.ID, value);
    }

    /**
     * Fetch records that have <code>idd BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfIdd(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.IDD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>idd IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByIdd(Integer... values) {
        return fetch(Journal.JOURNAL.IDD, values);
    }

    /**
     * Fetch a unique record that has <code>idd = value</code>
     */
    public org.example.spring.tutorial.generated.tables.pojos.Journal fetchOneByIdd(Integer value) {
        return fetchOne(Journal.JOURNAL.IDD, value);
    }

    /**
     * Fetch records that have <code>date_of_receipt BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfDateOfReceipt(String lowerInclusive, String upperInclusive) {
        return fetchRange(Journal.JOURNAL.DATE_OF_RECEIPT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>date_of_receipt IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByDateOfReceipt(String... values) {
        return fetch(Journal.JOURNAL.DATE_OF_RECEIPT, values);
    }

    /**
     * Fetch records that have <code>card_number_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfCardNumberId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.CARD_NUMBER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>card_number_id IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByCardNumberId(Integer... values) {
        return fetch(Journal.JOURNAL.CARD_NUMBER_ID, values);
    }

    /**
     * Fetch records that have <code>patient_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfPatientName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Journal.JOURNAL.PATIENT_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>patient_name IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByPatientName(String... values) {
        return fetch(Journal.JOURNAL.PATIENT_NAME, values);
    }

    /**
     * Fetch records that have <code>doctor_name_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfDoctorNameId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.DOCTOR_NAME_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>doctor_name_id IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByDoctorNameId(Integer... values) {
        return fetch(Journal.JOURNAL.DOCTOR_NAME_ID, values);
    }

    /**
     * Fetch records that have <code>doctor_post BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfDoctorPost(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.DOCTOR_POST, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>doctor_post IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByDoctorPost(Integer... values) {
        return fetch(Journal.JOURNAL.DOCTOR_POST, values);
    }

    /**
     * Fetch records that have <code>service_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfServiceId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.SERVICE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>service_id IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByServiceId(Integer... values) {
        return fetch(Journal.JOURNAL.SERVICE_ID, values);
    }

    /**
     * Fetch records that have <code>quantity BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfQuantity(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Journal.JOURNAL.QUANTITY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>quantity IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByQuantity(Integer... values) {
        return fetch(Journal.JOURNAL.QUANTITY, values);
    }

    /**
     * Fetch records that have <code>create_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfCreateDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Journal.JOURNAL.CREATE_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByCreateDate(LocalDateTime... values) {
        return fetch(Journal.JOURNAL.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>delete_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchRangeOfDeleteDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Journal.JOURNAL.DELETE_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>delete_date IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Journal> fetchByDeleteDate(LocalDateTime... values) {
        return fetch(Journal.JOURNAL.DELETE_DATE, values);
    }
}