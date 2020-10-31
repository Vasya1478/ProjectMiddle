package org.example.spring.tutorial.dto.services;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseListDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ServicesListDto extends BaseListDto {

    private String number;
    private String serviceName;
    private String typeOfServiceId;
    private String price;
    private String discount;
}
