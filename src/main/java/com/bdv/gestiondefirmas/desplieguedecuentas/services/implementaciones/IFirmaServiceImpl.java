package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.FirmaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SelloRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IFirmaService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IFirmaServiceImpl implements IFirmaService {

    @Autowired
    FirmaRepository firmaRepository;


    @Override
    public Optional<Firma> findByIdImagen(Long idImagen) {
        return firmaRepository.finByIdImagen(idImagen);
    }
}
