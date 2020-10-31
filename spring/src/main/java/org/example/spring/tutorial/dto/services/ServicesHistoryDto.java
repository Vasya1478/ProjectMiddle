package org.example.spring.tutorial.dto.services;


import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;

@Setter
@Getter
public class ServicesHistoryDto extends BaseHistoryDto {

    private String number;
    private String serviceName;
    private String typeOfServiceId;
    private String price;
    private String discount;
}
