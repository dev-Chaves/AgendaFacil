package com.agendarai.Agenda.Facil.repository;

import com.agendarai.Agenda.Facil.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
