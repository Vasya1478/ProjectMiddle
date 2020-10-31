package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.NameOfServiceDao;
import org.example.spring.tutorial.generated.tables.pojos.NameOfService;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.NameOfService.NAME_OF_SERVICE;


@Repository
public class NameOfServiceDaoImpl extends NameOfServiceDao implements BaseDao<NameOfService> {

    private final DSLContext jooq;

    public NameOfServiceDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public NameOfService getActiveByIdd(Integer idd) {
        return jooq.select(NAME_OF_SERVICE.fields())
                .from(NAME_OF_SERVICE)
                .where(NAME_OF_SERVICE.IDD.eq(idd).and(NAME_OF_SERVICE.DELETE_DATE.isNull()))
                .fetchOneInto(NameOfService.class);
    }

    public List<NameOfService> getHistory(Integer idd) {
        return jooq.selectFrom(NAME_OF_SERVICE)
                .where(NAME_OF_SERVICE.IDD.eq(idd))
                .fetchInto(NameOfService.class);
    }

    public NameOfService create(NameOfService nameOfService) {
        nameOfService.setId(jooq.nextval(Sequences.NAME_OF_SERVICE_ID_SEQ).intValue());
        if (nameOfService.getIdd() == null) {
            nameOfService.setIdd(nameOfService.getId());
        }
        nameOfService.setCreateDate(LocalDateTime.now());
        super.insert(nameOfService);
        return nameOfService;
    }
}
