package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="SELLOS")
public class Sellos {

    @Id
    @Column(name="ID_Imagen")
    private Long idImagen;

    @Column(name="ID_Cuenta")
    @JsonIgnore
    private String idCuenta;

    @Column(name="ID_Tipo_Imagen")
    private Integer idTipoImagen;

    @Column(name="Tipo_Imagen")
    private String tipoImagen;



    @Column(name="Consecutivo")
    private Integer consecutivo;


}
