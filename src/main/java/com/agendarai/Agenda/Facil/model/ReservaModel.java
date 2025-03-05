package com.agendarai.Agenda.Facil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_reserva")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private UserModel professor;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private UserModel aluno;

    @OneToOne
    @JoinColumn(name = "availability_id", nullable = false, unique = true)
    private AvailabilityModel availability;
}
