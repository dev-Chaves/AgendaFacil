package com.agendarai.Agenda.Facil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_aluno")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlunoModel {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, unique = true)
    private String userEmail;

    @Column(nullable = false)
    private String password;

    // Token do personal para garantir que o aluno veja apenas os horários do personal associado
    @Column(nullable = false)
    private UUID personalToken;

    // Muitos alunos podem estar associados a um único personal
    @ManyToOne
    @JoinColumn(name = "personal_id", nullable = false)
    private PersonalModel personal;

    // O aluno pode ter várias reservas
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReservaModel> reservas;
}
