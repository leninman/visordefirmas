package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.CuentaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ICuentaServiceImpl implements ICuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    private final static String ACCION_SELECT_PRODUCTO="SELECT_PRODUCTO";

    public ICuentaServiceImpl(CuentaRepository cuentaRepository) {
    }


    @Override
    public Optional<Cuenta> findById(String idCuenta) {
        return cuentaRepository.findCuenta(idCuenta);
        //return null;
    }




}
