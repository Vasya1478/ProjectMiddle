package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generated.Sequences;
import org.example.spring.tutorial.generated.tables.daos.JournalDao;
import org.example.spring.tutorial.generated.tables.pojos.Journal;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Journal.JOURNAL;


@Repository
public class JournalDaoImpl extends JournalDao implements BaseDao<Journal> {

    private final DSLContext jooq;

    public JournalDaoImpl(DSLContext jooq) {
        super(jooq.configuration());
        this.jooq = jooq;
    }

    public Journal getActiveByIdd(Integer idd) {
        return jooq.select(JOURNAL.fields())
                .from(JOURNAL)
                .where(JOURNAL.IDD.eq(idd).and(JOURNAL.DELETE_DATE.isNull()))
                .fetchOneInto(Journal.class);
    }

    public List<Journal> getHistory(Integer idd) {
        return jooq.selectFrom(JOURNAL)
                .where(JOURNAL.IDD.eq(idd))
                .fetchInto(Journal.class);
    }

    public Journal create(Journal journal) {
        journal.setId(jooq.nextval(Sequences.JOURNAL_ID_SEQ).intValue());
        if (journal.getIdd() == null) {
            journal.setIdd(journal.getId());
        }
        journal.setCreateDate(LocalDateTime.now());
        super.insert(journal);
        return journal;
    }
}
