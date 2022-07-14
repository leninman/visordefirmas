package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;

import java.util.Optional;

public interface ICuentaService {

    public Iterable<Cuenta> findAll();

    public Optional<Cuenta> findById(Long idCuenta);

    public Cuenta save(Cuenta cuenta);

    public void deleteById(Long idCuenta);
}
