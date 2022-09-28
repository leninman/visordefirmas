package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;

import java.util.List;
import java.util.Optional;

public interface ICondicionesService {

    List<Optional<Condiciones>> findByIdCuenta(String idCuenta);

}
