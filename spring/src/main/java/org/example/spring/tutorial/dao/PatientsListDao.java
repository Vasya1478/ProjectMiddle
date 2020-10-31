package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.patients.PatientsParams;
import org.example.spring.tutorial.generated.tables.pojos.Patients;
import org.example.spring.tutorial.generated.tables.records.PatientsRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Patients.PATIENTS;

@Repository
@AllArgsConstructor
public class PatientsListDao implements BaseListDao<Patients, PatientsParams> {
    private final DSLContext jooq;

    public Page<Patients> list(PageParams<PatientsParams> pageParams) {
        final PatientsParams params = pageParams.getParams() == null
                ? new PatientsParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<Patients> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(Patients.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<PatientsRecord> getDoctorsSelect(PatientsParams params) {
        var condition = PATIENTS.DELETE_DATE.isNull();
        if (params.getCardNumber() != null) {
            condition = condition.and(PATIENTS.CARD_NUMBER.like(params.getCardNumber()));
        }
        if (params.getName() != null) {
            condition = condition.and(PATIENTS.NAME.like(params.getName()));
        }
        if (params.getAge() != null) {
            condition = condition.and(PATIENTS.AGE.like(params.getAge()));
        }
        if (params.getAddress() != null) {
            condition = condition.and(PATIENTS.ADDRESS.like(params.getAddress()));
        }
        if (params.getInsuranceNumber() != null) {
            condition = condition.and(PATIENTS.INSURANCE_NUMBER.like(params.getInsuranceNumber()));
        }
        if (params.getPhoneNumber() != null) {
            condition = condition.and(PATIENTS.PHONE_NUMBER.like(params.getPhoneNumber()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(PATIENTS.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(PATIENTS)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{PATIENTS.IDD.asc()}
                    : new SortField[]{PATIENTS.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? PATIENTS.IDD.asc() : PATIENTS.IDD.desc());
            }
            if (order.equalsIgnoreCase("createDate")) {
                listSortBy.add(asc ? PATIENTS.CREATE_DATE.asc() : PATIENTS.CREATE_DATE.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
