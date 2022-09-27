package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Condiciones;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Firmante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FirmanteRepository extends JpaRepository<Firmante,String> {

    @Query(value="SELECT DISTINCT " +
            "b.ID_Persona," +
            "f.Nombre," +
            "f.Direccion," +
            "b.ID_Tipo," +
            "c.Tipo," +
            "d.ID_TipoImagen as ID_Tipo_Imagen," +
            "e.TipoImagen as Tipo_Imagen," +
            "b.ID_Imagen " +
            "FROM " +
            "Producto a," +
            "Producto_Persona b," +
            "Tipo c," +
            "Imagen d," +
            "TipoImagen e," +
            "Persona f " +
            "WHERE " +
            "a.ID_Cuenta=?1 AND " +
            "a.ID_Cuenta=b.ID_Cuenta AND " +
            "b.ID_Tipo=c.ID_Tipo AND " +
            "b.ID_Persona=f.ID_Persona AND " +
            "b.ID_Imagen=d.ID_Imagen  AND " +
            "d.ID_TipoImagen=e.ID_TipoImagen " +
            "ORDER BY b.ID_Persona",nativeQuery = true)
    List<Optional<Firmante>> findByIdCuenta(String idCuenta);
}
