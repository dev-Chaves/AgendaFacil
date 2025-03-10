package com.agendarai.Agenda.Facil.repository;

import com.agendarai.Agenda.Facil.model.AvailabilityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface AvailabilityRepository extends JpaRepository<AvailabilityModel, UUID> {
    List<AvailabilityModel> findByPersonalIdAndIsAvailable(UUID personalId, boolean isAvailable);
    List<AvailabilityModel> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
}

