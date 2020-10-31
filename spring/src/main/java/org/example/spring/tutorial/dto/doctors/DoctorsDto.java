package org.example.spring.tutorial.dto.doctors;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class DoctorsDto extends BaseDto<DoctorsHistoryDto> {

    private String employeeCode;
    private String name;
    private String positionId;
    private String cabinetNumber;
    private String timeOfReceiptId;
    private String typeOfServiceId;


    private List<DoctorsHistoryDto> history;

}
