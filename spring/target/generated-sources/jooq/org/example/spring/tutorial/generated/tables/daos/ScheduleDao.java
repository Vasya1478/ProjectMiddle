/*
 * This file is generated by jOOQ.
 */
package org.example.spring.tutorial.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;

import org.example.spring.tutorial.generated.tables.Schedule;
import org.example.spring.tutorial.generated.tables.records.ScheduleRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class ScheduleDao extends DAOImpl<ScheduleRecord, org.example.spring.tutorial.generated.tables.pojos.Schedule, Integer> {

    /**
     * Create a new ScheduleDao without any configuration
     */
    public ScheduleDao() {
        super(Schedule.SCHEDULE, org.example.spring.tutorial.generated.tables.pojos.Schedule.class);
    }

    /**
     * Create a new ScheduleDao with an attached configuration
     */
    @Autowired
    public ScheduleDao(Configuration configuration) {
        super(Schedule.SCHEDULE, org.example.spring.tutorial.generated.tables.pojos.Schedule.class, configuration);
    }

    @Override
    public Integer getId(org.example.spring.tutorial.generated.tables.pojos.Schedule object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedule.SCHEDULE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchById(Integer... values) {
        return fetch(Schedule.SCHEDULE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.example.spring.tutorial.generated.tables.pojos.Schedule fetchOneById(Integer value) {
        return fetchOne(Schedule.SCHEDULE.ID, value);
    }

    /**
     * Fetch records that have <code>idd BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchRangeOfIdd(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Schedule.SCHEDULE.IDD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>idd IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchByIdd(Integer... values) {
        return fetch(Schedule.SCHEDULE.IDD, values);
    }

    /**
     * Fetch a unique record that has <code>idd = value</code>
     */
    public org.example.spring.tutorial.generated.tables.pojos.Schedule fetchOneByIdd(Integer value) {
        return fetchOne(Schedule.SCHEDULE.IDD, value);
    }

    /**
     * Fetch records that have <code>time_of_receipt BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchRangeOfTimeOfReceipt(String lowerInclusive, String upperInclusive) {
        return fetchRange(Schedule.SCHEDULE.TIME_OF_RECEIPT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>time_of_receipt IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchByTimeOfReceipt(String... values) {
        return fetch(Schedule.SCHEDULE.TIME_OF_RECEIPT, values);
    }

    /**
     * Fetch records that have <code>create_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchRangeOfCreateDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Schedule.SCHEDULE.CREATE_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchByCreateDate(LocalDateTime... values) {
        return fetch(Schedule.SCHEDULE.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>delete_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchRangeOfDeleteDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Schedule.SCHEDULE.DELETE_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>delete_date IN (values)</code>
     */
    public List<org.example.spring.tutorial.generated.tables.pojos.Schedule> fetchByDeleteDate(LocalDateTime... values) {
        return fetch(Schedule.SCHEDULE.DELETE_DATE, values);
    }
}
