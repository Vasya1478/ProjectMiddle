package org.example.spring.tutorial.dto.shedule;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;

@Setter
@Getter
public class SheduleHistoryDto extends BaseHistoryDto {

    private String timeOfReceipt;
}
