package org.example.spring.tutorial.dao;


import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.generate.JooqBs;

public interface BaseListDao<Entity extends JooqBs, Params>  {
    Page<Entity> list(PageParams<Params> pageParams);
}
