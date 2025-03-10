package com.agendarai.Agenda.Facil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservaDTO {
    private UUID id;
    private UUID alunoId;
    private UUID availabilityId;
    private String alunoName;
    private LocalDateTime dateTime;
}
