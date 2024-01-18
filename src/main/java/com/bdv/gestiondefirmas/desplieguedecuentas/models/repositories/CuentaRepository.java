package com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Map;
import java.util.Optional;

public interface CuentaRepository extends JpaRepository<Cuenta,Long> {

    @Query(value = "{call sp_VISOR(:Accion,:sProducto,:sPersonaId)}",nativeQuery = true)
    Optional<Cuenta> spVISOR(String Accion,String sProducto,String sPersonaId);


    //@Procedure
    //Map<String,Object> sp_VISOR(@Param("Accion") String Accion,@Param("sProducto") String sProducto,@Param("sPersonaId") String sPersonaId);


    /*@Query(value="SELECT  DISTINCT " +
            "a.ID_Cuenta," +
            "a.ID_Sucursal," +
            "f.Nombre," +
            "a.ID_Titular," +
            "a.ID_Representante," +
            "a.ID_TipoCuenta as ID_Tipo_Cuenta," +
            "c.TipoCuenta as Tipo_Cuenta," +
            "a.ID_TipoTitular as ID_Tipo_Titular," +
            "d.TipoTitular as Tipo_Titular," +
            "a.ID_TipoRegla as ID_Tipo_Regla," +
            "e.TipoRegla as Tipo_Regla," +
            "e.Status as status," +
            "a.Observacion as observacion," +
            "a.Fecha_Creacion as Fecha_Creacion," +
            "a.Fecha_Modificacion as Fecha_Modificacion " +
            "from Producto a," +
            "TipoCuenta c," +
            "TipoTitular d," +
            "TipoRegla e," +
            "Sucursal f " +
            "WHERE " +
            "a.ID_TipoCuenta=c.ID_TipoCuenta AND " +
            "a.ID_TipoTitular=d.ID_TipoTitular AND " +
            "a.ID_TipoRegla=e.ID_TipoRegla AND " +
            "a.ID_Sucursal=f.ID_Sucursal AND " +
            "a.ID_Cuenta=?1",nativeQuery = true)
    Optional<Cuenta> findCuenta(String idCuenta);*/

    //Query(value="{call sp_VISOR(:AccionIn,:idCuentaIn)}",nativeQuery = true)
   //Optional<Cuenta> findCuenta(@Param("AccionIn") String AccionIn, @Param("idCuentaIn") String idCuentaIn);

   // @Procedure
   // Optional<Cuenta> sp_VISOR(String Accion, String sProducto);




}
/*@Repository
public class CuentaRepository {

    @PersistenceContext
    EntityManager em;

     public String findCuenta(String Accion, String sProducto){

         StoredProcedureQuery storedProcedureQuery=em.createStoredProcedureQuery("sp_VISOR");
        storedProcedureQuery.registerStoredProcedureParameter("Accion",String.class,ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("sProducto",String.class,ParameterMode.IN);
         storedProcedureQuery.registerStoredProcedureParameter("ID_Cuenta",String.class,ParameterMode.OUT);
        storedProcedureQuery.setParameter("Accion",Accion);
        storedProcedureQuery.setParameter("sProducto",sProducto);
        return (String) storedProcedureQuery.getSingleResult();

     }*/









