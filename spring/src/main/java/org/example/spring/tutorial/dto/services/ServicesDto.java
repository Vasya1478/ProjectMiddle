package org.example.spring.tutorial.dto.services;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class ServicesDto extends BaseDto<ServicesHistoryDto> {

    private String number;
    private String serviceName;
    private String typeOfServiceId;
    private String price;
    private String discount;

    private List<ServicesHistoryDto> history;
}
