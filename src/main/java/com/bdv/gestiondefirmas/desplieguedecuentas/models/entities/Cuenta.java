package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="CUENTAS")
public class Cuenta {


    @Id
    @Column(name="ID_Cuenta")
    private String idCuenta;

    @Column(name="ID_Sucursal")
    private String idSucursal;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="ID_Titular")
    private String idTitular;

    @Column(name="ID_Representante")
    private String idRepresentante;

    @Column(name="ID_Tipo_Cuenta")
    private Integer idTipoCuenta;

    @Column(name="Tipo_Cuenta")
    private String tipoCuenta;

    @Column(name="ID_Tipo_Titular")
    private Integer idTipoTitular;

    @Column(name="Tipo_Titular")
    private String tipoTitular;

    @Column(name="Id_Tipo_Regla")
    private Integer idTipoRegla;

    @Column(name="Tipo_Regla")
    private String tipoRegla;

    @Column(name="Status")
    private Integer status;

    @Column(name="Observacion")
    private String observacion;

    @Column(name="Fecha_Creacion")
    private LocalDateTime fechaCreacion;

    @Column(name="Fecha_Modificacion")
    private LocalDateTime fechaModificacion;


    @PrePersist
    public void prePersist(){
        this.fechaCreacion= LocalDateTime.now();
    }

}
