package org.example.spring.tutorial.dto.nameOfPosition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseListDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NameOfPositionListDto extends BaseListDto {

    private String position;
    private String salary;
    private String premium;
}
