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
public class SerumCreatinineDto {
    private Long patientId;
    private Double serumCreatinine;
    MultipartFile report;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate reportedDate;
}