package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.DoctorsDaoImpl;
import org.example.spring.tutorial.dao.DoctorsListDao;
import org.example.spring.tutorial.dao.ServicesDaoImpl;
import org.example.spring.tutorial.dao.ServicesListDao;
import org.example.spring.tutorial.dto.doctors.DoctorsDto;
import org.example.spring.tutorial.dto.doctors.DoctorsHistoryDto;
import org.example.spring.tutorial.dto.doctors.DoctorsListDto;
import org.example.spring.tutorial.dto.doctors.DoctorsParams;
import org.example.spring.tutorial.dto.services.ServicesDto;
import org.example.spring.tutorial.dto.services.ServicesHistoryDto;
import org.example.spring.tutorial.dto.services.ServicesListDto;
import org.example.spring.tutorial.dto.services.ServicesParams;
import org.example.spring.tutorial.generated.tables.pojos.Doctors;
import org.example.spring.tutorial.generated.tables.pojos.Services;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService extends BaseService<ServicesListDto,
        ServicesDto,
        ServicesParams,
        Services> {

    private ServicesDaoImpl servicesDao;
    private MappingService mappingService;

    public ServicesService(ServicesListDao servicesListDao,
                           ServicesDaoImpl servicesDao,
                           MappingService mappingService) {
        super(mappingService, servicesListDao, ServicesListDto.class,
                servicesDao, ServicesDto.class, Services.class);
    }



    public List<ServicesHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(servicesDao.getHistory(idd), ServicesHistoryDto.class);
    }
}
