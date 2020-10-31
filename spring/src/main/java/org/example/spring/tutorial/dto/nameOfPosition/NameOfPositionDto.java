package org.example.spring.tutorial.dto.nameOfPosition;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class NameOfPositionDto extends BaseDto<NameOfPositionHistoryDto> {

    private String position;
    private String salary;
    private String premium;

    private List<NameOfPositionHistoryDto> history;
}
