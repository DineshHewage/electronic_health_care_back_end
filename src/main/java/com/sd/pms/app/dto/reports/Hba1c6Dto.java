package com.sd.pms.app.dto.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hba1c6Dto {
    private Long patientId;
    private Double hba1c6;
    MultipartFile report;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate reportedDate;
}
