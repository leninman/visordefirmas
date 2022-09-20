package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;

import java.util.Optional;

public interface ICondicionesService {

    public Optional<Condiciones> findByIdCuenta(String idCuenta);

}
