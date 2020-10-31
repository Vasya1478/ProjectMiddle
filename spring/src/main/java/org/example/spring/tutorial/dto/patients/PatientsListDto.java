package org.example.spring.tutorial.dto.patients;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseListDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatientsListDto extends BaseListDto {

    private String cardNumber;
    private String name;
    private String age;
    private String address;
    private String insuranceNumber;
    private String phoneNumber;
}
