package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.patients.PatientsDto;
import org.example.spring.tutorial.dto.patients.PatientsHistoryDto;
import org.example.spring.tutorial.dto.patients.PatientsListDto;
import org.example.spring.tutorial.dto.patients.PatientsParams;
import org.example.spring.tutorial.generated.tables.pojos.Patients;
import org.example.spring.tutorial.service.PatientsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/patients", produces = "application/json; charset=UTF-8")
public class PatientsController extends BaseController<PatientsListDto,
        PatientsDto,
        PatientsParams,
        Patients> {

    private PatientsService patientsService;

    public PatientsController(PatientsService patientsService) {
        super(patientsService);
        this.patientsService = patientsService;
    }

    @GetMapping("/{idd}/history")
    public List<PatientsHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return patientsService.getHistory(idd);
    }
}
