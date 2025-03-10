package com.agendarai.Agenda.Facil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AvailabilityDTO {
    private UUID id;
    private LocalDateTime dateTime;
    private boolean isAvailable;
    private UUID personalId;

}
