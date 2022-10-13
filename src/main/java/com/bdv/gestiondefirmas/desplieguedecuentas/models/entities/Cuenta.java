package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
/*@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name="consultarCuenta",
                procedureName = "sp_VISOR",
                parameters = {
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="Accion", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sProducto", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sPersonaId", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_Cuenta", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_Sucursal", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="Nombre", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_Titular", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_Representante", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_TipoCuenta", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="TipoCuenta", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_TipoTitular", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="TipoTitular", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="ID_TipoRegla", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="TipoRegla", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="Status", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="Observacion", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="Fecha_Creacion", type=LocalDateTime.class),
                        @StoredProcedureParameter(mode=ParameterMode.OUT, name="Fecha_Modificacion", type=LocalDateTime.class)

                })
})*/
public class Cuenta implements Serializable {


    @Id
    private String idCuenta;


    private String idSucursal;

    private String nombre;


    private String idTitular;


    private String idRepresentante;


    private Integer idTipoCuenta;


    private String tipoCuenta;


    private Integer idTipoTitular;

    private String tipoTitular;


    private Integer idTipoRegla;


    private String tipoRegla;


    private Integer status;


    private String observacion;


    private LocalDateTime fechaCreacion;


    private LocalDateTime fechaModificacion;




    @PrePersist
    public void prePersist(){
        this.fechaCreacion= LocalDateTime.now();
    }

}
