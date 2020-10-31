package org.example.spring.tutorial.service;

import org.example.spring.tutorial.dao.JournalDaoImpl;
import org.example.spring.tutorial.dao.JournalListDao;
import org.example.spring.tutorial.dto.journal.JournalDto;
import org.example.spring.tutorial.dto.journal.JournalHistoryDto;
import org.example.spring.tutorial.dto.journal.JournalListDto;
import org.example.spring.tutorial.dto.journal.JournalParams;
import org.example.spring.tutorial.generated.tables.pojos.Journal;
import org.example.spring.tutorial.mapping.MappingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService extends BaseService<JournalListDto, JournalDto, JournalParams, Journal> {

    private JournalDaoImpl journalDao;
    private MappingService mappingService;

    public JournalService(JournalListDao journalListDao, JournalDaoImpl journalDao,
                          MappingService mappingService) {
        super(mappingService, journalListDao, JournalListDto.class,
                journalDao, JournalDto.class, Journal.class);
    }



    public List<JournalHistoryDto> getHistory(Integer idd) {

        return mappingService.mapList(journalDao.getHistory(idd), JournalHistoryDto.class);
    }
}
