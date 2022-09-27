package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends CrudRepository<Persona,String> {

    @Query(value="Select p.ID_Persona as ID_PERSONA," +
            "p.Nombre as NOMBRE," +
            "p.Direccion AS DIRECCION" +
            " from Persona p where p.ID_Persona=?1",nativeQuery = true)
    Optional<Persona> findByIdPersona(String idPersona);
}
