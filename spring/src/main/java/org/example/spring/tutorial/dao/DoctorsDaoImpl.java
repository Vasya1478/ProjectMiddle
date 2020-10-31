package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.DoctorsDao;
import org.example.spring.tutorial.generated.tables.pojos.Doctors;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Doctors.DOCTORS;

@Repository
public class DoctorsDaoImpl extends DoctorsDao implements BaseDao<Doctors> {

    private final DSLContext jooq;

    public DoctorsDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public Doctors getActiveByIdd(Integer idd) {
        return jooq.select(DOCTORS.fields())
                .from(DOCTORS)
                .where(DOCTORS.IDD.eq(idd).and(DOCTORS.DELETE_DATE.isNull()))
                .fetchOneInto(Doctors.class);
    }

    public List<Doctors> getHistory(Integer idd) {
        return jooq.selectFrom(DOCTORS)
                .where(DOCTORS.IDD.eq(idd))
                .fetchInto(Doctors.class);
    }

    public Doctors create(Doctors doctor) {
        doctor.setId(jooq.nextval(Sequences.DOCTORS_ID_SEQ).intValue());
        if (doctor.getIdd() == null) {
            doctor.setIdd(doctor.getId());
        }
        doctor.setCreateDate(LocalDateTime.now());
        super.insert(doctor);
        return doctor;
    }
}
