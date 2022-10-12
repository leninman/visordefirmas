package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.CuentaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.TelefonoRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ITelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ITelefonoServiceImpl implements ITelefonoService {

    @Autowired
    TelefonoRepository telefonoRepository;


    @Override
    @Transactional(readOnly=true)
    public Optional<Telefono> findByIdPersona(String idPersona) {
        return telefonoRepository.finByIdPersona(idPersona);
    }
}
