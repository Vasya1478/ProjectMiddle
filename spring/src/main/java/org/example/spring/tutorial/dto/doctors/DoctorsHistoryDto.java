package org.example.spring.tutorial.dto.doctors;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;

@Setter
@Getter
public class DoctorsHistoryDto extends BaseHistoryDto {

    private String employeeCode;
    private String name;
    private String positionId;
    private String cabinetNumber;
    private String timeOfReceiptId;
    private String typeOfServiceId;
}
