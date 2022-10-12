package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Persona;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.FirmanteRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.PersonaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IFirmanteService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class IPersonaServiceImpl implements IPersonaService {

    @Autowired
    PersonaRepository personaRepository;



    @Override
    @Transactional(readOnly=true)
    public Optional<Persona> findByIdPersona(String idPersona) {
        return personaRepository.findByIdPersona(idPersona);
    }
}
