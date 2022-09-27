package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.Map;
import java.util.Optional;

public interface FirmaRepository extends CrudRepository<Firma,Long> {

    @Query(value="Select a.ID_TipoImagen as ID_Tipo_Imagen," +
            "null as Longitud," +
            "a.Imagen " +
            "from Imagen a " +
            "where a.ID_Imagen=?1",nativeQuery = true)
    Firma getFirma(Long idImagen);


}
