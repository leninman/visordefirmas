package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TelefonoRepository extends CrudRepository<Telefono,Long> {
    @Query(value="SELECT Telefono " +
            "FROM Telefono " +
            "WHERE ID_Persona =?1 ",nativeQuery = true)
    List<Telefono> finByIdPersona(String idPersona);
}
