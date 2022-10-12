package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.FirmaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SelloRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.IFirmaService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class IFirmaServiceImpl implements IFirmaService {

    @Autowired
    FirmaRepository firmaRepository;


    @Override
    @Transactional(readOnly=true)
    public Firma findByIdImagen(Long idImagen) {

        Firma firma=new Firma();

        try {
            firma = firmaRepository.getFirma(idImagen);
            Integer longitud = firma.getImagen().length();
            firma.setLongitud(longitud / 2);
            firma.setImagen("0x".concat(firma.getImagen()));
        }catch(Exception e){
            log.error(e.getMessage());
        }
        return firma;
    }


}
