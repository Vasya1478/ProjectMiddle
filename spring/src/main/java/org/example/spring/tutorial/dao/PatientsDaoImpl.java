package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.PatientsDao;
import org.example.spring.tutorial.generated.tables.pojos.Patients;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Patients.PATIENTS;

@Repository
public class PatientsDaoImpl extends PatientsDao implements BaseDao<Patients> {

    private final DSLContext jooq;

    public PatientsDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public Patients getActiveByIdd(Integer idd) {
        return jooq.select(PATIENTS.fields())
                .from(PATIENTS)
                .where(PATIENTS.IDD.eq(idd).and(PATIENTS.DELETE_DATE.isNull()))
                .fetchOneInto(Patients.class);
    }

    public List<Patients> getHistory(Integer idd) {
        return jooq.selectFrom(PATIENTS)
                .where(PATIENTS.IDD.eq(idd))
                .fetchInto(Patients.class);
    }

    public Patients create(Patients patients) {
        patients.setId(jooq.nextval(Sequences.PATIENTS_ID_SEQ).intValue());
        if (patients.getIdd() == null) {
            patients.setIdd(patients.getId());
        }
        patients.setCreateDate(LocalDateTime.now());
        super.insert(patients);
        return patients;
    }
}
