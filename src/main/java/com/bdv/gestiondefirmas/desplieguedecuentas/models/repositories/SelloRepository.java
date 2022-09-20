package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SelloRepository extends CrudRepository<Sello,Long> {

    @Query(value="Select * from SELLO u where u.ID_IMAGEN=?1",nativeQuery = true)
    Optional<Sello> finByIdImagen(Long idCuenta);
}
