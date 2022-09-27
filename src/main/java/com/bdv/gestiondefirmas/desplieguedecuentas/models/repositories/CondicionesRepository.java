package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CondicionesRepository extends CrudRepository<Condiciones,Long> {

    @Query(value="SELECT Combinacion.ID_Tipo1," +
            "TipoJ.Tipo as Tipo1," +
            "Combinacion.ID_Tipo2," +
            "TipoX.Tipo as Tipo2," +
            "Combinacion.Monto " +
            "FROM " +
            "Combinacion " +
            "JOIN Tipo AS TipoJ ON Combinacion.ID_Tipo1 = TipoJ.ID_Tipo " +
            "JOIN Tipo AS TipoX ON Combinacion.ID_Tipo2 = TipoX.ID_Tipo " +
            "WHERE " +
            "ID_Cuenta=?1",nativeQuery = true)
    Optional<Condiciones> findByIdCuenta(String idCuenta);

}
