package org.example.spring.tutorial.dto.patients;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class PatientsDto extends BaseDto<PatientsHistoryDto> {

    private String cardNumber;
    private String name;
    private String age;
    private String address;
    private String insuranceNumber;
    private String phoneNumber;


    private List<PatientsHistoryDto> history;
}
