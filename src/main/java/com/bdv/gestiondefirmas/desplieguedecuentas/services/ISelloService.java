package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;

import java.util.List;
import java.util.Optional;

public interface ISelloService {

    Optional<Sello> findByIdImagen(Long idImagen);





}
