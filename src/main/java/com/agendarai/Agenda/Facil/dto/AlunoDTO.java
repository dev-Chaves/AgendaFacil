package com.agendarai.Agenda.Facil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlunoDTO {
    private UUID id;
    private String userName;
    private String userEmail;
    private UUID personalToken;
    private String password;
    private UUID personalId;
}
