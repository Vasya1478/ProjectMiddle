package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.ScheduleDao;
import org.example.spring.tutorial.generated.tables.pojos.Doctors;
import org.example.spring.tutorial.generated.tables.pojos.Schedule;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Schedule.SCHEDULE;

@Repository
public class SheduleDaoImpl extends ScheduleDao implements BaseDao<Schedule> {

    private final DSLContext jooq;

    public SheduleDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public Schedule getActiveByIdd(Integer idd) {
        return jooq.select(SCHEDULE.fields())
                .from(SCHEDULE)
                .where(SCHEDULE.IDD.eq(idd).and(SCHEDULE.DELETE_DATE.isNull()))
                .fetchOneInto(Schedule.class);
    }

    public List<Schedule> getHistory(Integer idd) {
        return jooq.selectFrom(SCHEDULE)
                .where(SCHEDULE.IDD.eq(idd))
                .fetchInto(Schedule.class);
    }

    public Schedule create(Schedule schedule) {
        schedule.setId(jooq.nextval(Sequences.SCHEDULE_ID_SEQ).intValue());
        if (schedule.getIdd() == null) {
            schedule.setIdd(schedule.getId());
        }
        schedule.setCreateDate(LocalDateTime.now());
        super.insert(schedule);
        return schedule;
    }
}
