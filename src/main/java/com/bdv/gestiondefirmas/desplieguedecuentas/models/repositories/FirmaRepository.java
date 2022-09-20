package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firma;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FirmaRepository extends CrudRepository<Firma,Long> {

    @Query(value="Select * from FIRMA u where u.ID_IMAGEN=?1",nativeQuery = true)
    Optional<Firma> finByIdImagen(Long idImagen);
}
