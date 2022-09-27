package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SelloRepository extends CrudRepository<Sello,Long> {

    @Query(value="Select a.ID_TipoImagen as ID_Tipo_Imagen," +
            "null as Longitud," +
            "a.Imagen " +
            "from Imagen a " +
            "where a.ID_Imagen=?1",nativeQuery = true)
    Sello finByIdImagen(Long idImagen);
}
