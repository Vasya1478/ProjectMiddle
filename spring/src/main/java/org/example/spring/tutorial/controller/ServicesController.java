package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.services.ServicesDto;
import org.example.spring.tutorial.dto.services.ServicesHistoryDto;
import org.example.spring.tutorial.dto.services.ServicesListDto;
import org.example.spring.tutorial.dto.services.ServicesParams;
import org.example.spring.tutorial.generated.tables.pojos.Services;
import org.example.spring.tutorial.service.ServicesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/services", produces = "application/json; charset=UTF-8")
public class ServicesController extends BaseController<ServicesListDto,
        ServicesDto,
        ServicesParams,
        Services> {

    private ServicesService servicesService;

    public ServicesController(ServicesService servicesService) {
        super(servicesService);
        this.servicesService = servicesService;
    }

    @GetMapping("/{idd}/history")
    public List<ServicesHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return servicesService.getHistory(idd);
    }
}
