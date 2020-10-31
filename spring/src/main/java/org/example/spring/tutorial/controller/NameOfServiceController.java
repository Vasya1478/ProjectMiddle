package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.nameOfService.NameOfServiceDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceHistoryDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceListDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceParams;
import org.example.spring.tutorial.generated.tables.pojos.NameOfService;
import org.example.spring.tutorial.service.NameOfServiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/name", produces = "application/json; charset=UTF-8")
public class NameOfServiceController extends BaseController<NameOfServiceListDto,
        NameOfServiceDto,
        NameOfServiceParams,
        NameOfService> {

    private NameOfServiceService nameOfServiceService;

    public NameOfServiceController(NameOfServiceService nameOfServiceService) {
        super(nameOfServiceService);
        this.nameOfServiceService = nameOfServiceService;
    }

    @GetMapping("/{idd}/history")
    public List<NameOfServiceHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return nameOfServiceService.getHistory(idd);
    }
}
