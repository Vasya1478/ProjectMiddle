package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.doctors.DoctorsParams;
import org.example.spring.tutorial.generated.tables.pojos.Doctors;
import org.example.spring.tutorial.generated.tables.records.DoctorsRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Doctors.DOCTORS;

@Repository
@AllArgsConstructor
public class DoctorsListDao implements BaseListDao<Doctors, DoctorsParams> {
    private final DSLContext jooq;

    public Page<Doctors> list(PageParams<DoctorsParams> pageParams) {
        final DoctorsParams params = pageParams.getParams() == null
                ? new DoctorsParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<Doctors> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(Doctors.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<DoctorsRecord> getDoctorsSelect(DoctorsParams params) {
        var condition = DOCTORS.DELETE_DATE.isNull();
        if (params.getEmployeeCode() != null) {
            condition = condition.and(DOCTORS.EMPLOYEE_CODE.like(params.getEmployeeCode()));
        }
        if (params.getName() != null) {
            condition = condition.and(DOCTORS.NAME.like(params.getName()));
        }
        if (params.getPositionId() != null) {
            condition = condition.and(DOCTORS.POSITION_ID.like(params.getPositionId()));
        }
        if (params.getCabinetNumber() != null) {
            condition = condition.and(DOCTORS.CABINET_NUMBER.like(params.getCabinetNumber()));
        }
        if (params.getTimeOfReceiptId() != null) {
            condition = condition.and(DOCTORS.TIME_OF_RECEIPT_ID.like(params.getTimeOfReceiptId()));
        }
        if (params.getTypeOfServiceId() != null) {
            condition = condition.and(DOCTORS.TYPE_OF_SERVICE_ID.like(params.getTypeOfServiceId()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(DOCTORS.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(DOCTORS)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{DOCTORS.IDD.asc()}
                    : new SortField[]{DOCTORS.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? DOCTORS.IDD.asc() : DOCTORS.IDD.desc());
            }
            if (order.equalsIgnoreCase("positionId")) {
                listSortBy.add(asc ? DOCTORS.POSITION_ID.asc() : DOCTORS.POSITION_ID.desc());
            }
            if (order.equalsIgnoreCase("employeeCode")) {
                listSortBy.add(asc ? DOCTORS.EMPLOYEE_CODE.asc() : DOCTORS.EMPLOYEE_CODE.desc());
            }
            if (order.equalsIgnoreCase("createDate")) {
                listSortBy.add(asc ? DOCTORS.CREATE_DATE.asc() : DOCTORS.CREATE_DATE.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
