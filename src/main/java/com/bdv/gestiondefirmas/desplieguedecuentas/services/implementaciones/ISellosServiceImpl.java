package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SellosRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.TelefonoRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISellosService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ITelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ISellosServiceImpl implements ISellosService {

    @Autowired
    SellosRepository sellosRepository;


    @Override
    @Transactional(readOnly=true)
    public List<Sellos> findByIdCuenta(String idCuenta) {
        return sellosRepository.finByIdCuenta(idCuenta);
    }


}
