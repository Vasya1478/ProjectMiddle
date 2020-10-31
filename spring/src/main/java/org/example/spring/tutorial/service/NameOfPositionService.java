package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.NameOfPositionDaoImpl;
import org.example.spring.tutorial.dao.NameOfPositionListDao;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionHistoryDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionListDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionParams;
import org.example.spring.tutorial.generated.tables.pojos.NameOfPosition;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameOfPositionService extends BaseService<NameOfPositionListDto, NameOfPositionDto,
        NameOfPositionParams, NameOfPosition> {

    private NameOfPositionDaoImpl nameOfPositionDao;
    private MappingService mappingService;

    public NameOfPositionService(NameOfPositionListDao nameOfPositionListDao,
                                 NameOfPositionDaoImpl nameOfPositionDao,
                                 MappingService mappingService) {
        super(mappingService, nameOfPositionListDao, NameOfPositionListDto.class,
                nameOfPositionDao, NameOfPositionDto.class, NameOfPosition.class);
    }



    public List<NameOfPositionHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(nameOfPositionDao.getHistory(idd), NameOfPositionHistoryDto.class);
    }
}
