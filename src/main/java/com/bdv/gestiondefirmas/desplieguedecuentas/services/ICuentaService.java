package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;

import java.util.Optional;

public interface ICuentaService {

    public Optional<Cuenta> findById(String idCuenta);


}
