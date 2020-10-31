package org.example.spring.tutorial.dto.journal;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseDto;

import java.util.List;

@Setter
@Getter
public class JournalDto extends BaseDto<JournalHistoryDto> {

    private String dateOfReceipt;
    private String cardNumberId;
    private String patientName;
    private String doctorNameId;
    private String doctorPost;
    private String serviceId;
    private String quantity;



    private List<JournalHistoryDto> history;
}
