package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.SheduleDaoImpl;
import org.example.spring.tutorial.dao.SheduleListDao;
import org.example.spring.tutorial.dto.shedule.SheduleDto;
import org.example.spring.tutorial.dto.shedule.SheduleHistoryDto;
import org.example.spring.tutorial.dto.shedule.SheduleListDto;
import org.example.spring.tutorial.dto.shedule.SheduleParams;
import org.example.spring.tutorial.generated.tables.pojos.Schedule;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheduleService extends BaseService<SheduleListDto,
        SheduleDto,
        SheduleParams,
        Schedule> {

    private SheduleDaoImpl sheduleDao;
    private MappingService mappingService;

    public SheduleService(SheduleListDao sheduleListDao, SheduleDaoImpl sheduleDao,
                          MappingService mappingService) {
        super(mappingService, sheduleListDao, SheduleListDto.class,
                sheduleDao, SheduleDto.class, Schedule.class);
    }



    public List<SheduleHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(sheduleDao.getHistory(idd), SheduleHistoryDto.class);
    }
}
