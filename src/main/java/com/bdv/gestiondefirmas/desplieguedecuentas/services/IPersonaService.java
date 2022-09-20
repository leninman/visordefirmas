package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

     Optional<Persona> findByIdPersona(String idPersona);

}
