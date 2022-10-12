package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.CuentaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.FirmanteRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IFirmanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class IFirmanteServiceImpl implements IFirmanteService {

    @Autowired
    FirmanteRepository firmanteRepository;


    @Override
    @Transactional(readOnly=true)
    public List<Optional<Firmante>> findByIdCuenta(String idCuenta) {
        return firmanteRepository.findByIdCuenta(idCuenta);
    }
}
