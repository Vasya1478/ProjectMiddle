package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.DoctorsDaoImpl;
import org.example.spring.tutorial.dao.DoctorsListDao;
import org.example.spring.tutorial.dto.doctors.DoctorsDto;
import org.example.spring.tutorial.dto.doctors.DoctorsHistoryDto;
import org.example.spring.tutorial.dto.doctors.DoctorsListDto;
import org.example.spring.tutorial.dto.doctors.DoctorsParams;
import org.example.spring.tutorial.generated.tables.pojos.Doctors;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsServise extends BaseService<DoctorsListDto, DoctorsDto, DoctorsParams, Doctors> {

    private DoctorsDaoImpl doctorsDao;
    private MappingService mappingService;

    public DoctorsServise(DoctorsListDao doctorsListDao, DoctorsDaoImpl doctorsDao,
                             MappingService mappingService) {
        super(mappingService, doctorsListDao, DoctorsListDto.class,
                doctorsDao, DoctorsDto.class, Doctors.class);
    }



    public List<DoctorsHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(doctorsDao.getHistory(idd), DoctorsHistoryDto.class);
    }
}
