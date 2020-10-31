package org.example.spring.tutorial.dto.journal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.spring.tutorial.dto.BaseListDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JournalListDto extends BaseListDto {

    private String dateOfReceipt;
    private String cardNumberId;
    private String patientName;
    private String doctorNameId;
    private String doctorPost;
    private String serviceId;
    private String quantity;
}
