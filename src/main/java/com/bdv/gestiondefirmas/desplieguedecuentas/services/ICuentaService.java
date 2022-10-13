package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ICuentaService {

    Optional<Cuenta> findById(String idCuenta);

   // Optional<Map<String,Object>> findById(String idCuenta);





}
