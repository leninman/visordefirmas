package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.awt.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Firma {

    @Id
    @Column(name="ID_Tipo_Imagen")
    private Integer idTipoImagen;

    @Column(name="Longitud")
    private Integer longitud;

    @Column(name="Imagen")
    private String imagen;



}
