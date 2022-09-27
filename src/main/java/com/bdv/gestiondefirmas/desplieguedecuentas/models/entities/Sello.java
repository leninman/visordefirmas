package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Sello implements Serializable {

    @Id
    @Column(name="ID_Tipo_Imagen")
    private Integer idTipoImagen;

    @Column(name="Longitud")
    private Integer longitud;

    @Column(name="Imagen")
    private String imagen;



}
