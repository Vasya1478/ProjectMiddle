package org.example.spring.tutorial.dto.shedule;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class SheduleDto extends BaseDto<SheduleHistoryDto> {

    private String timeOfReceipt;

    private List<SheduleHistoryDto> history;
}
