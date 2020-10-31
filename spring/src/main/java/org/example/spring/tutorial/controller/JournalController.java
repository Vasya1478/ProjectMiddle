package org.example.spring.tutorial.controller;

import org.example.spring.tutorial.dto.journal.JournalDto;
import org.example.spring.tutorial.dto.journal.JournalHistoryDto;
import org.example.spring.tutorial.dto.journal.JournalListDto;
import org.example.spring.tutorial.dto.journal.JournalParams;
import org.example.spring.tutorial.generated.tables.pojos.Journal;
import org.example.spring.tutorial.service.JournalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/journal", produces = "application/json; charset=UTF-8")
public class JournalController extends BaseController<JournalListDto,
        JournalDto,
        JournalParams,
        Journal> {

    private JournalService journalService;

    public JournalController(JournalService journalService) {
        super(journalService);
        this.journalService = journalService;
    }

    @GetMapping("/{idd}/history")
    public List<JournalHistoryDto> getHistory(@PathVariable(name = "idd") Integer idd) {
        return journalService.getHistory(idd);
    }
}
