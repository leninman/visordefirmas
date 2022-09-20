package com.bdv.gestiondefirmas.desplieguedecuentas.services;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;

import java.util.Optional;

public interface IFirmaService {

    Optional<Firma> findByIdImagen(Long idImagen);





}
