package org.example.spring.tutorial.dto.nameOfService;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class NameOfServiceDto extends BaseDto<NameOfServiceHistoryDto> {

    private String typeOfService;

    private List<NameOfServiceHistoryDto> history;
}
