package org.example.spring.tutorial.dto.nameOfService;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;

@Setter
@Getter
public class NameOfServiceHistoryDto extends BaseHistoryDto {

    private String typeOfService;
}
