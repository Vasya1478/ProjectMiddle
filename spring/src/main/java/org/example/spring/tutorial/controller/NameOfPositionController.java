package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionHistoryDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionListDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionParams;
import org.example.spring.tutorial.generated.tables.pojos.NameOfPosition;
import org.example.spring.tutorial.service.NameOfPositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/position", produces = "application/json; charset=UTF-8")
public class NameOfPositionController extends BaseController<NameOfPositionListDto,
        NameOfPositionDto,
        NameOfPositionParams,
        NameOfPosition> {

    private NameOfPositionService nameOfPositionService;

    public NameOfPositionController(NameOfPositionService nameOfPositionService) {
        super(nameOfPositionService);
        this.nameOfPositionService = nameOfPositionService;
    }

    @GetMapping("/{idd}/history")
    public List<NameOfPositionHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return nameOfPositionService.getHistory(idd);
    }
}
