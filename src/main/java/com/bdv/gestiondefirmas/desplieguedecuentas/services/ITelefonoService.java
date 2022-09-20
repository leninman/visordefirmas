package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;

import java.util.List;
import java.util.Optional;

public interface ITelefonoService {

    public Optional<Telefono> findByIdPersona(String idPersona);





}
