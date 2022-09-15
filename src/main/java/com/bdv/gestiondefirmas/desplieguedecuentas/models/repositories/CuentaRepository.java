package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaRepository extends CrudRepository<Cuenta,String> {
}
