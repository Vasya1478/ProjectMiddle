package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.BaseDto;
import org.example.spring.tutorial.dto.BaseListDto;
import org.example.spring.tutorial.dto.Page;
import org.example.spring.tutorial.dto.PageParams;
import org.example.spring.tutorial.generate.JooqBs;
import org.example.spring.tutorial.service.BaseService;
import org.springframework.web.bind.annotation.*;


public abstract class BaseController<List extends BaseListDto, Dto extends BaseDto, Params, Entity extends JooqBs> {

    private BaseService<List, Dto, Params, Entity> service;

    public BaseController(BaseService<List, Dto, Params, Entity> service) {
        this.service = service;
    }

    @PostMapping("/list")
    public Page<List> getList(@RequestBody PageParams<Params> pageParams) {

        return service.list(pageParams);
    }

    @PostMapping
    public void create(@RequestBody Dto dto) {
        service.create(dto);
    }

    @GetMapping("/{idd}")
    public Dto get(@PathVariable(name = "idd") Integer idd) {

        return service.get(idd);
    }

    @PatchMapping("/{idd}")
    public Dto update(@PathVariable(name = "idd") Integer idd, @RequestBody Dto dto) {

        return service.update(idd, dto);
    }

    @DeleteMapping("/{idd}")
    public void delete(@PathVariable(name = "idd") Integer idd) {
        service.delete(idd);
    }
}
