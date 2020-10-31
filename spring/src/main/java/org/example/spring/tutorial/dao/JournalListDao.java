package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.journal.JournalParams;
import org.example.spring.tutorial.generated.tables.pojos.Journal;
import org.example.spring.tutorial.generated.tables.records.JournalRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Journal.JOURNAL;

@Repository
@AllArgsConstructor
public class JournalListDao implements BaseListDao<Journal, JournalParams> {
    private final DSLContext jooq;

    public Page<Journal> list(PageParams<JournalParams> pageParams) {
        final JournalParams params = pageParams.getParams() == null
                ? new JournalParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<Journal> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(Journal.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<JournalRecord> getDoctorsSelect(JournalParams params) {
        var condition = JOURNAL.DELETE_DATE.isNull();
        if (params.getDateOfReceipt() != null) {
            condition = condition.and(JOURNAL.DATE_OF_RECEIPT.like(params.getDateOfReceipt()));
        }
        if (params.getCardNumberId() != null) {
            condition = condition.and(JOURNAL.CARD_NUMBER_ID.like(params.getCardNumberId()));
        }
        if (params.getPatientName() != null) {
            condition = condition.and(JOURNAL.PATIENT_NAME.like(params.getPatientName()));
        }
        if (params.getDoctorNameId() != null) {
            condition = condition.and(JOURNAL.DOCTOR_NAME_ID.like(params.getDoctorNameId()));
        }
        if (params.getDoctorPost() != null) {
            condition = condition.and(JOURNAL.DOCTOR_POST.like(params.getDoctorPost()));
        }
        if (params.getServiceId() != null) {
            condition = condition.and(JOURNAL.SERVICE_ID.like(params.getServiceId()));
        }
        if (params.getQuantity() != null) {
            condition = condition.and(JOURNAL.QUANTITY.like(params.getQuantity()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(JOURNAL.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(JOURNAL)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{JOURNAL.IDD.asc()}
                    : new SortField[]{JOURNAL.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? JOURNAL.IDD.asc() : JOURNAL.IDD.desc());
            }
            if (order.equalsIgnoreCase("cardNumberId")) {
                listSortBy.add(asc ? JOURNAL.CARD_NUMBER_ID.asc() : JOURNAL.CARD_NUMBER_ID.desc());
            }
            if (order.equalsIgnoreCase("patientName")) {
                listSortBy.add(asc ? JOURNAL.PATIENT_NAME.asc() : JOURNAL.PATIENT_NAME.desc());
            }
            if (order.equalsIgnoreCase("quantity")) {
                listSortBy.add(asc ? JOURNAL.QUANTITY.asc() : JOURNAL.QUANTITY.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
