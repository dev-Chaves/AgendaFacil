package com.agendarai.Agenda.Facil.repository;

import com.agendarai.Agenda.Facil.model.PersonalModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PersonalRepository extends JpaRepository<PersonalModel, UUID> {
    Optional<PersonalModel> findByUserEmail(String email);
}
