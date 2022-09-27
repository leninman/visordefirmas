package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Sellos implements Serializable {

    @Id
    @Column(name="ID_Imagen")
    private Long idImagen;


    @Column(name="ID_Tipo_Imagen")
    private Integer idTipoImagen;

    @Column(name="Tipo_Imagen")
    private String tipoImagen;

    @Column(name="Consecutivo")
    private Integer consecutivo;


}
