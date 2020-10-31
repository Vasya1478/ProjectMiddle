package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.BaseDao;
import org.example.spring.tutorial.dao.BaseListDao;
import org.example.spring.tutorial.dto.BaseDto;
import org.example.spring.tutorial.dto.BaseListDto;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.generate.JooqBs;
import org.example.spring.tutorial.mapping.BaseMapping;


import java.time.LocalDateTime;

public abstract class BaseService<List extends BaseListDto, Dto extends BaseDto, Params, Entity extends JooqBs> {

    private BaseMapping mappingService;
    private BaseListDao<Entity, Params> listDao;
    private Class<List> listClass;
    private BaseDao<Entity> baseDao;
    private Class<Dto> dtoClass;
    private Class<Entity> entityClass;

    public BaseService(BaseMapping mappingService, BaseListDao<Entity, Params> listDao,
                       Class<List> listClass, BaseDao<Entity> baseDao, Class<Dto> dtoClass,
                       Class<Entity> entityClass) {
        this.mappingService = mappingService;
        this.listDao = listDao;
        this.listClass = listClass;
        this.baseDao = baseDao;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    public Page<List> list(PageParams<Params> pageParams) {
        Page<Entity> page = listDao.list(pageParams);
        java.util.List<List> list = mappingService.mapList(page.getList(), listClass);
        return new Page<>(list, page.getTotalCount());
    }

    public Dto create(Dto dto) {

        return mappingService.map(baseDao.create(mappingService.map(dto, entityClass)), dtoClass);
    }

    public Dto get(Integer idd) {
        return mappingService.map(baseDao.getActiveByIdd(idd), dtoClass);
    }

    public void delete(Integer idd) {
        Entity entity = baseDao.getActiveByIdd(idd);
        if (entity == null) {
            throw new RuntimeException("");
        }
        entity.setDeleteDate(LocalDateTime.now());
        baseDao.update(entity);
        mappingService.map(entity, dtoClass);
    }

    public Dto update(Integer idd, Dto dto) {
        Entity entity = baseDao.getActiveByIdd(idd);
        if (entity == null) {
            throw new RuntimeException("");
        }
        entity.setDeleteDate(LocalDateTime.now());
        baseDao.update(entity);
        Entity newEntity = mappingService.map(dto, entityClass);
        newEntity.setIdd(entity.getIdd());
        baseDao.create(newEntity);
        return mappingService.map(entity, dtoClass);
    }

}
