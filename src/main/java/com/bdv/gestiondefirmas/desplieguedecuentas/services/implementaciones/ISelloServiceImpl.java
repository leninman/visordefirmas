package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SelloRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.SellosRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISelloService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISellosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ISelloServiceImpl implements ISelloService {

    @Autowired
    SelloRepository selloRepository;


    @Override
    @Transactional(readOnly=true)
    public Sello findByIdImagen(Long idImagen) {

        Sello sello=new Sello();

        try {
            sello = selloRepository.finByIdImagen(idImagen);
            Integer longitud = sello.getImagen().length();
            sello.setLongitud(longitud / 2);
            sello.setImagen("0x".concat(sello.getImagen()));
        }catch(Exception e){
            log.error(e.getMessage());
        }
        return sello;
    }
}
