package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.NameOfPositionDao;
import org.example.spring.tutorial.generated.tables.pojos.NameOfPosition;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.NameOfPosition.NAME_OF_POSITION;


@Repository
public class NameOfPositionDaoImpl extends NameOfPositionDao implements BaseDao<NameOfPosition> {

    private final DSLContext jooq;

    public NameOfPositionDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public NameOfPosition getActiveByIdd(Integer idd) {
        return jooq.select(NAME_OF_POSITION.fields())
                .from(NAME_OF_POSITION)
                .where(NAME_OF_POSITION.IDD.eq(idd).and(NAME_OF_POSITION.DELETE_DATE.isNull()))
                .fetchOneInto(NameOfPosition.class);
    }

    public List<NameOfPosition> getHistory(Integer idd) {
        return jooq.selectFrom(NAME_OF_POSITION)
                .where(NAME_OF_POSITION.IDD.eq(idd))
                .fetchInto(NameOfPosition.class);
    }

    public NameOfPosition create(NameOfPosition nameOfPosition) {
        nameOfPosition.setId(jooq.nextval(Sequences.NAME_OF_POSITION_ID_SEQ).intValue());
        if (nameOfPosition.getIdd() == null) {
            nameOfPosition.setIdd(nameOfPosition.getId());
        }
        nameOfPosition.setCreateDate(LocalDateTime.now());
        super.insert(nameOfPosition);
        return nameOfPosition;
    }
}
