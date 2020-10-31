package org.example.spring.tutorial.mapping;

import lombok.AllArgsConstructor;
import org.example.spring.tutorial.dao.*;
import org.example.spring.tutorial.dto.doctors.DoctorsDto;
import org.example.spring.tutorial.dto.doctors.DoctorsHistoryDto;
import org.example.spring.tutorial.dto.journal.JournalDto;
import org.example.spring.tutorial.dto.journal.JournalHistoryDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionDto;
import org.example.spring.tutorial.dto.nameOfPosition.NameOfPositionHistoryDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceDto;
import org.example.spring.tutorial.dto.nameOfService.NameOfServiceHistoryDto;
import org.example.spring.tutorial.dto.patients.PatientsDto;
import org.example.spring.tutorial.dto.patients.PatientsHistoryDto;
import org.example.spring.tutorial.dto.services.ServicesDto;
import org.example.spring.tutorial.dto.services.ServicesHistoryDto;
import org.example.spring.tutorial.dto.shedule.SheduleDto;
import org.example.spring.tutorial.dto.shedule.SheduleHistoryDto;
import org.example.spring.tutorial.generated.tables.pojos.*;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MappingService implements BaseMapping {
    private final ModelMapper modelMapper;
    private final DoctorsDaoImpl doctorsDao;
    private final JournalDaoImpl journalDao;
    private final NameOfPositionDaoImpl nameOfPositionDao;
    private final NameOfServiceDaoImpl nameOfServiceDao;
    private final PatientsDaoImpl patientsDao;
    private final ServicesDaoImpl servicesDao;
    private final SheduleDaoImpl sheduleDao;


    @PostConstruct
    public void init() {
        Converter<Integer, List<DoctorsHistoryDto>> doctorsHistory =
                context -> mapList(doctorsDao.getHistory(context.getSource()), DoctorsHistoryDto.class);
         modelMapper.typeMap(Doctors.class, DoctorsDto.class)
                .addMappings(mapper -> mapper.using(doctorsHistory).map(Doctors::getIdd, DoctorsDto::setHistory));

        Converter<Integer, List<JournalHistoryDto>> journalHistory =
                context -> mapList(journalDao.getHistory(context.getSource()), JournalHistoryDto.class);
        modelMapper.typeMap(Journal.class, JournalDto.class)
                .addMappings(mapper -> mapper.using(journalHistory).map(Journal::getIdd, JournalDto::setHistory));

        Converter<Integer, List<NameOfPositionHistoryDto>> nameOfPositionHistory =
                context -> mapList(nameOfPositionDao.getHistory(context.getSource()), NameOfPositionHistoryDto.class);
        modelMapper.typeMap(NameOfPosition.class, NameOfPositionDto.class)
                .addMappings(mapper -> mapper.using(nameOfPositionHistory).map(NameOfPosition::getIdd, NameOfPositionDto::setHistory));

        Converter<Integer, List<NameOfServiceHistoryDto>> nameOfServiceHistory =
                context -> mapList(nameOfServiceDao.getHistory(context.getSource()), NameOfServiceHistoryDto.class);
        modelMapper.typeMap(NameOfService.class, NameOfServiceDto.class)
                .addMappings(mapper -> mapper.using(nameOfServiceHistory).map(NameOfService::getIdd, NameOfServiceDto::setHistory));

        Converter<Integer, List<PatientsHistoryDto>> patientsHistory =
                context -> mapList(patientsDao.getHistory(context.getSource()), PatientsHistoryDto.class);
        modelMapper.typeMap(Patients.class, PatientsDto.class)
                .addMappings(mapper -> mapper.using(patientsHistory).map(Patients::getIdd, PatientsDto::setHistory));

        Converter<Integer, List<ServicesHistoryDto>> servicesHistory =
                context -> mapList(servicesDao.getHistory(context.getSource()), ServicesHistoryDto.class);
        modelMapper.typeMap(Services.class, ServicesDto.class)
                .addMappings(mapper -> mapper.using(servicesHistory).map(Services::getIdd, ServicesDto::setHistory));

        Converter<Integer, List<SheduleHistoryDto>> sheduleHistory =
                context -> mapList(sheduleDao.getHistory(context.getSource()), SheduleHistoryDto.class);
        modelMapper.typeMap(Schedule.class, SheduleDto.class)
                .addMappings(mapper -> mapper.using(sheduleHistory).map(Schedule::getIdd, SheduleDto::setHistory));

}
    public <S, D> D map(S source, Class<D> clazz) {
        return modelMapper.map(source, clazz);
    }

    public <S, D> void map(S source, D dest) {
        modelMapper.map(source, dest);
    }

    public <S, D> List<D> mapList(List<S> sources, Class<D> clazz) {
        return sources.stream()
                .map(s -> map(s, clazz))
                .collect(Collectors.toList());
    }

}
