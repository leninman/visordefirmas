package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SellosRepository extends CrudRepository<Sellos,Long> {

    @Query(value="SELECT  Imagen.ID_TipoImagen as ID_TIPO_IMAGEN," +
            "TipoImagen.TipoImagen as TIPO_IMAGEN," +
            "Producto_Sello.ID_Imagen," +
            "Producto_Sello.Consecutivo " +
            "FROM " +
            "Producto_Sello " +
            "JOIN Imagen ON Imagen.ID_Imagen = Producto_Sello.ID_Imagen " +
            "JOIN TipoImagen ON TipoImagen.ID_TipoImagen = Imagen.ID_TipoImagen " +
            "WHERE ID_Cuenta=?1 " +
            "ORDER BY " +
            "Producto_Sello.Consecutivo",nativeQuery = true)
    List<Sellos> finByIdCuenta(String idCuenta);
}
