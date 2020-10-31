package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.PatientsDaoImpl;
import org.example.spring.tutorial.dao.PatientsListDao;
import org.example.spring.tutorial.dto.patients.PatientsDto;
import org.example.spring.tutorial.dto.patients.PatientsHistoryDto;
import org.example.spring.tutorial.dto.patients.PatientsListDto;
import org.example.spring.tutorial.dto.patients.PatientsParams;
import org.example.spring.tutorial.generated.tables.pojos.Patients;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsService extends BaseService<PatientsListDto, PatientsDto,
        PatientsParams, Patients> {

    private PatientsDaoImpl patientsDao;
    private MappingService mappingService;

    public PatientsService(PatientsListDao patientsListDao,
                           PatientsDaoImpl patientsDao,
                           MappingService mappingService) {
        super(mappingService, patientsListDao, PatientsListDto.class,
                patientsDao, PatientsDto.class, Patients.class);
    }



    public List<PatientsHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(patientsDao.getHistory(idd), PatientsHistoryDto.class);
    }
}
