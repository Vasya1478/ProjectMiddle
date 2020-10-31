package org.example.spring.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.val;
import lombok.var;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.dto.services.ServicesParams;
import org.example.spring.tutorial.generated.tables.pojos.Services;
import org.example.spring.tutorial.generated.tables.records.ServicesRecord;
import org.jooq.DSLContext;
import org.jooq.SelectSeekStepN;
import org.jooq.SortField;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.example.spring.tutorial.generated.tables.Services.SERVICES;

@Repository
@AllArgsConstructor
public class ServicesListDao implements BaseListDao<Services, ServicesParams> {
    private final DSLContext jooq;

    public Page<Services> list(PageParams<ServicesParams> pageParams) {
        final ServicesParams params = pageParams.getParams() == null
                ? new ServicesParams() : pageParams.getParams();
        val listQuery = getDoctorsSelect(params);

        val count = jooq.selectCount()
                .from(listQuery)
                .fetchOne(0, Long.class);

        List<Services> list = listQuery.offset(pageParams.getStart())
                .limit(pageParams.getPage())
                .fetchInto(Services.class);
        return new Page<>(list, count);
    }

    private SelectSeekStepN<ServicesRecord> getDoctorsSelect(ServicesParams params) {
        var condition = SERVICES.DELETE_DATE.isNull();
        if (params.getNumber() != null) {
            condition = condition.and(SERVICES.NUMBER.like(params.getNumber()));
        }
        if (params.getServiceName() != null) {
            condition = condition.and(SERVICES.SERVICE_NAME.like(params.getServiceName()));
        }
        if (params.getTypeOfServiceId() != null) {
            condition = condition.and(SERVICES.TYPE_OF_SERVICE_ID.like(params.getTypeOfServiceId()));
        }
        if (params.getPrice() != null) {
            condition = condition.and(SERVICES.PRICE.like(params.getPrice()));
        }
        if (params.getDiscount() != null) {
            condition = condition.and(SERVICES.DISCOUNT.like(params.getNumber()));
        }
        if (params.getCreateDateStart() != null && params.getCreateDateEnd() != null) {
            condition = condition.and(SERVICES.CREATE_DATE.between(params.getCreateDateStart(),
                    params.getCreateDateEnd()));
        }

        val sort = getOrderBy(params.getOrderBy(), params.getOrderDir());

        return jooq.selectFrom(SERVICES)
                .where(condition)
                .orderBy(sort);
    }

    private SortField[] getOrderBy(String orderBy, String orderDir) {
        val asc = orderDir == null || orderDir.equalsIgnoreCase("asc");

        if (orderBy == null) {
            return asc
                    ? new SortField[]{SERVICES.IDD.asc()}
                    : new SortField[]{SERVICES.IDD.desc()};

        }

        val orderArray = orderBy.split(",");

        List<SortField> listSortBy = new ArrayList<>();
        for (val order: orderArray) {
            if (order.equalsIgnoreCase("idd")) {
                listSortBy.add(asc ? SERVICES.IDD.asc() : SERVICES.IDD.desc());
            }
            if (order.equalsIgnoreCase("createDate")) {
                listSortBy.add(asc ? SERVICES.CREATE_DATE.asc() : SERVICES.CREATE_DATE.desc());
            }
        }

        return listSortBy.toArray(new SortField[0]);
    }
}
