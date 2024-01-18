package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.CondicionesRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICondicionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ICondicionesServiceImpl implements ICondicionesService {

    @Autowired
    CondicionesRepository condicionesRepository;


    @Override
    @Transactional(readOnly=true)
    public List<Optional<Condiciones>> findByIdCuenta(String idCuenta) {
        return condicionesRepository.findByIdCuenta("SELECT_RULE",idCuenta,"");
    }
}
