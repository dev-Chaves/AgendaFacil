package com.agendarai.Agenda.Facil.repository;

import com.agendarai.Agenda.Facil.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, UUID> {
    Optional<AlunoModel> findByUserEmail(String email);
    Optional<AlunoModel> findByUserName(String userName);
}

