package org.example.spring.tutorial.dto.journal;

import lombok.Getter;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseHistoryDto;

@Setter
@Getter
public class JournalHistoryDto extends BaseHistoryDto {

    private String dateOfReceipt;
    private String cardNumberId;
    private String patientName;
    private String doctorNameId;
    private String doctorPost;
    private String serviceId;
    private String quantity;
}
