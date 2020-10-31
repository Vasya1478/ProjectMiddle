package org.example.spring.tutorial.dao;

import org.example.spring.tutorial.generate.JooqBs;

public interface BaseDao<Entity extends JooqBs> {
    Entity create(Entity entity);

    Entity getActiveByIdd(Integer idd);

    void update(Entity room);
}
