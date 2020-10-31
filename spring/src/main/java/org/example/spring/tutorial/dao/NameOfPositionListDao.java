package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionParams;
import org.example.spring.tutorial.generated.tables.pojos.NameOfPosition;
import org.example.spring.tutorial.generated.tables.records.NameOfPositionRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.NameOfPosition.NAME_OF_POSITION;

@Repository
@AllArgsConstructor
public class NameOfPositionListDao implements BaseListDao<NameOfPosition, NameOfPositionParams> {
    private final DSLContext jooq;

    public Page<NameOfPosition> list(PageParams<NameOfPositionParams> pageParams) {
        final NameOfPositionParams params = pageParams.getParams() == null
                ? new NameOfPositionParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<NameOfPosition> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(NameOfPosition.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<NameOfPositionRecord> getDoctorsSelect(NameOfPositionParams params) {
        var condition = NAME_OF_POSITION.DELETE_DATE.isNull();
        if (params.getPosition() != null) {
            condition = condition.and(NAME_OF_POSITION.POSITION.like(params.getPosition()));
        }
        if (params.getSalary() != null) {
            condition = condition.and(NAME_OF_POSITION.SALARY.like(params.getSalary()));
        }
        if (params.getPremium() != null) {
            condition = condition.and(NAME_OF_POSITION.PREMIUM.like(params.getPremium()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(NAME_OF_POSITION.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(NAME_OF_POSITION)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{NAME_OF_POSITION.IDD.asc()}
                    : new SortField[]{NAME_OF_POSITION.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? NAME_OF_POSITION.IDD.asc() : NAME_OF_POSITION.IDD.desc());
            }
            if (order.equalsIgnoreCase("salary")) {
                listSortBy.add(asc ? NAME_OF_POSITION.SALARY.asc() : NAME_OF_POSITION.SALARY.desc());
            }
            if (order.equalsIgnoreCase("premium")) {
                listSortBy.add(asc ? NAME_OF_POSITION.PREMIUM.asc() : NAME_OF_POSITION.PREMIUM.desc());
            }
            if (order.equalsIgnoreCase("createDate")) {
                listSortBy.add(asc ? NAME_OF_POSITION.CREATE_DATE.asc() : NAME_OF_POSITION.CREATE_DATE.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
