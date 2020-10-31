package org.example.spring.tutorial.dto.patients;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;

@Setter
@Getter
public class PatientsHistoryDto extends BaseHistoryDto {

    private String cardNumber;
    private String name;
    private String age;
    private String address;
    private String insuranceNumber;
    private String phoneNumber;
}
