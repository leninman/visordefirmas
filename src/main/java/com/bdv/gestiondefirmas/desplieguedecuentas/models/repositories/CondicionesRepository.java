package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CondicionesRepository extends CrudRepository<Condiciones,Long> {

    @Query(value="Select * from CONDICIONES u where u.ID_CUENTA=?1",nativeQuery = true)
    Optional<Condiciones> findByIdCuenta(String idCuenta);

}
