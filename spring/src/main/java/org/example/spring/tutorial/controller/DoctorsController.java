package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.doctors.DoctorsDto;
import org.example.spring.tutorial.dto.doctors.DoctorsHistoryDto;
import org.example.spring.tutorial.dto.doctors.DoctorsListDto;
import org.example.spring.tutorial.dto.doctors.DoctorsParams;
import org.example.spring.tutorial.generated.tables.pojos.Doctors;
import org.example.spring.tutorial.service.DoctorsServise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/doctors", produces = "application/json; charset=UTF-8")
public class DoctorsController extends BaseController<DoctorsListDto,
        DoctorsDto,
        DoctorsParams,
        Doctors> {

    private DoctorsServise doctorsServise;

    public DoctorsController(DoctorsServise doctorsServise) {
        super(doctorsServise);
        this.doctorsServise = doctorsServise;
    }

    @GetMapping("/{idd}/history")
    public List<DoctorsHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return doctorsServise.getHistory(idd);
    }
}
