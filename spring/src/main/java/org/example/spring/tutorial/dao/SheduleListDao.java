package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.shedule.SheduleParams;
import org.example.spring.tutorial.generated.tables.pojos.Schedule;
import org.example.spring.tutorial.generated.tables.records.ScheduleRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Schedule.SCHEDULE;

@Repository
@AllArgsConstructor
public class SheduleListDao implements BaseListDao<Schedule, SheduleParams> {
    private final DSLContext jooq;

    public Page<Schedule> list(PageParams<SheduleParams> pageParams) {
        final SheduleParams params = pageParams.getParams() == null
                ? new SheduleParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<Schedule> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(Schedule.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<ScheduleRecord> getDoctorsSelect(SheduleParams params) {
        var condition = SCHEDULE.DELETE_DATE.isNull();
        if (params.getTimeOfReceipt() != null) {
            condition = condition.and(SCHEDULE.TIME_OF_RECEIPT.like(params.getTimeOfReceipt()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(SCHEDULE.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(SCHEDULE)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{SCHEDULE.IDD.asc()}
                    : new SortField[]{SCHEDULE.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? SCHEDULE.IDD.asc() : SCHEDULE.IDD.desc());
            }
            if (order.equalsIgnoreCase("createDate")) {
                listSortBy.add(asc ? SCHEDULE.CREATE_DATE.asc() : SCHEDULE.CREATE_DATE.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
