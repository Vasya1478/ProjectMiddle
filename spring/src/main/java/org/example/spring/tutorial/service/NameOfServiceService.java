package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.NameOfServiceDaoImpl;
import org.example.spring.tutorial.dao.NameOfServiceListDao;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceHistoryDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceListDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceParams;
import org.example.spring.tutorial.generated.tables.pojos.NameOfService;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameOfServiceService extends BaseService<NameOfServiceListDto,
        NameOfServiceDto, NameOfServiceParams, NameOfService> {

    private NameOfServiceDaoImpl nameOfServiceDao;
    private MappingService mappingService;

    public NameOfServiceService(NameOfServiceListDao nameOfServiceListDao,
                                NameOfServiceDaoImpl nameOfServiceDao,
                                MappingService mappingService) {
        super(mappingService, nameOfServiceListDao, NameOfServiceListDto.class,
                nameOfServiceDao, NameOfServiceDto.class, NameOfService.class);
    }



    public List<NameOfServiceHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(nameOfServiceDao.getHistory(idd), NameOfServiceHistoryDto.class);
    }
}
