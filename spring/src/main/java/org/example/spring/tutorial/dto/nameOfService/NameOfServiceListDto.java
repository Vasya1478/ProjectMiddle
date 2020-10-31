package org.example.spring.tutorial.dto.nameOfService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseListDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NameOfServiceListDto extends BaseListDto {

    private String typeOfService;
}
