package com.agendarai.Agenda.Facil.repository;

import com.agendarai.Agenda.Facil.model.ReservaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaModel, UUID> {
    List<ReservaModel> findByAlunoId(UUID alunoId);
    List<ReservaModel> findByAvailabilityId(UUID availabilityId);
}
