package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.ServicesDao;
import org.example.spring.tutorial.generated.tables.pojos.Services;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Services.SERVICES;

@Repository
public class ServicesDaoImpl extends ServicesDao implements BaseDao<Services> {

    private final DSLContext jooq;

    public ServicesDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public Services getActiveByIdd(Integer idd) {
        return jooq.select(SERVICES.fields())
                .from(SERVICES)
                .where(SERVICES.IDD.eq(idd).and(SERVICES.DELETE_DATE.isNull()))
                .fetchOneInto(Services.class);
    }

    public List<Services> getHistory(Integer idd) {
        return jooq.selectFrom(SERVICES)
                .where(SERVICES.IDD.eq(idd))
                .fetchInto(Services.class);
    }

    public Services create(Services services) {
        services.setId(jooq.nextval(Sequences.SERVICES_ID_SEQ).intValue());
        if (services.getIdd() == null) {
            services.setIdd(services.getId());
        }
        services.setCreateDate(LocalDateTime.now());
        super.insert(services);
        return services;
    }
}
