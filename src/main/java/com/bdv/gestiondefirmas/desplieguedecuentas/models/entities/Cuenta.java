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
