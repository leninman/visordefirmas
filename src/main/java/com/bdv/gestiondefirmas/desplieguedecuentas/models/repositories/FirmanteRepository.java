package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FirmanteRepository extends CrudRepository<Firmante,String> {

    @Query(value="Select * from FIRMANTES u where u.ID_CUENTA=?1",nativeQuery = true)
    List<Optional<Firmante>> findByIdCuenta(String idCuenta);
}
