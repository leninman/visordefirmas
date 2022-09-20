package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;

import java.util.List;
import java.util.Optional;

public interface ISellosService {

    List<Optional<Sellos>> findByIdCuenta(String idCuenta);





}
