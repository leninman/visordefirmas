package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;

import java.util.List;
import java.util.Optional;

public interface IFirmanteService {

     List<Optional<Firmante>> findByIdCuenta(String idCuenta);

}
