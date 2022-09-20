package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SelloRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SellosRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISelloService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISellosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ISelloServiceImpl implements ISelloService {

    @Autowired
    SelloRepository selloRepository;


    @Override
    public Optional<Sello> findByIdImagen(Long idImagen) {
        return selloRepository.finByIdImagen(idImagen);
    }
}
