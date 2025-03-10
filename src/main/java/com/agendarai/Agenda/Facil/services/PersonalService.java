package com.agendarai.Agenda.Facil.services;

import com.agendarai.Agenda.Facil.model.PersonalModel;
import com.agendarai.Agenda.Facil.repository.PersonalRepository;
import org.aspectj.weaver.bcel.BcelAnnotation;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonalService {

    private final PersonalRepository personalRepository;

    private BCryptPasswordEncoder passwordEncoder;

    public PersonalService(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    public PersonalModel cadastroPersonal(PersonalModel personal) {
        Optional<PersonalModel> existingPersonal = personalRepository.findByUserEmail(personal.getUserEmail());
        if (existingPersonal.isPresent()) {
            throw new RuntimeException("E-mail já cadastrado!");
        }

        personal.setPassword(passwordEncoder.encode(personal.getPassword()));

        return personalRepository.save(personal);
    }

}
