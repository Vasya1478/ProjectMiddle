package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.shedule.SheduleDto;
import org.example.spring.tutorial.dto.shedule.SheduleHistoryDto;
import org.example.spring.tutorial.dto.shedule.SheduleListDto;
import org.example.spring.tutorial.dto.shedule.SheduleParams;
import org.example.spring.tutorial.generated.tables.pojos.Schedule;
import org.example.spring.tutorial.service.SheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/shedule", produces = "application/json; charset=UTF-8")
public class SheduleController extends BaseController<SheduleListDto,
        SheduleDto,
        SheduleParams,
        Schedule> {

    private SheduleService sheduleService;

    public SheduleController(SheduleService sheduleService) {
        super(sheduleService);
        this.sheduleService = sheduleService;
    }

    @GetMapping("/{idd}/history")
    public List<SheduleHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return sheduleService.getHistory(idd);
    }
}
