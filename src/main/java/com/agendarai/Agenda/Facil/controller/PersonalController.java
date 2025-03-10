package com.agendarai.Agenda.Facil.controller;

import com.agendarai.Agenda.Facil.model.PersonalModel;
import com.agendarai.Agenda.Facil.services.PersonalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personais")
public class PersonalController {

    private final PersonalService personalService;

    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<PersonalModel> cadastrarPersonal(@RequestBody PersonalModel personal) {

        PersonalModel novoPersonal = personalService.cadastroPersonal(personal);

        return ResponseEntity.ok(personalService.cadastroPersonal(novoPersonal));
    }
}
