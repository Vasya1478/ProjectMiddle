package org.example.spring.tutorial.dto.nameOfPosition;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;


@Setter
@Getter
public class NameOfPositionHistoryDto extends BaseHistoryDto {

    private String position;
    private String salary;
    private String premium;
}
