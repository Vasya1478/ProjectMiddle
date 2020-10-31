package org.example.spring.tutorial.dto.shedule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseListDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SheduleListDto extends BaseListDto {

    private String timeOfReceipt;
}
