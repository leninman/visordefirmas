package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SellosRepository extends CrudRepository<Sellos,Long> {

    @Query(value="Select * from SELLOS u where u.ID_CUENTA=?1",nativeQuery = true)
    List<Optional<Sellos>> finByIdCuenta(String idCuenta);
}
