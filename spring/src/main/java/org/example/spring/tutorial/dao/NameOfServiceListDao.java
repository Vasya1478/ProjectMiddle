package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceParams;
import org.example.spring.tutorial.generated.tables.pojos.NameOfService;
import org.example.spring.tutorial.generated.tables.records.NameOfServiceRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.NameOfService.NAME_OF_SERVICE;

@Repository
@AllArgsConstructor
public class NameOfServiceListDao implements BaseListDao<NameOfService, NameOfServiceParams> {
    private final DSLContext jooq;

    public Page<NameOfService> list(PageParams<NameOfServiceParams> pageParams) {
        final NameOfServiceParams params = pageParams.getParams() == null
                ? new NameOfServiceParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<NameOfService> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(NameOfService.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<NameOfServiceRecord> getDoctorsSelect(NameOfServiceParams params) {
        var condition = NAME_OF_SERVICE.DELETE_DATE.isNull();
        if (params.getTypeOfService() != null) {
            condition = condition.and(NAME_OF_SERVICE.TYPE_OF_SERVICE.like(params.getTypeOfService()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(NAME_OF_SERVICE.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(NAME_OF_SERVICE)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{NAME_OF_SERVICE.IDD.asc()}
                    : new SortField[]{NAME_OF_SERVICE.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? NAME_OF_SERVICE.IDD.asc() : NAME_OF_SERVICE.IDD.desc());
            }
            if (order.equalsIgnoreCase("createDate")) {
                listSortBy.add(asc ? NAME_OF_SERVICE.CREATE_DATE.asc() : NAME_OF_SERVICE.CREATE_DATE.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
