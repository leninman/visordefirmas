package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="SELLO")
public class Sello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name="ID_Sello")
    private Long idSello;

    @Column(name="ID_Tipo_Imagen")
    private Integer idTipoImagen;

    @Column(name="ID_Imagen")
    @JsonIgnore
    private Long idImagen;

    @Column(name="Longitud")
    private Integer longitud;

    @Column(name="Imagen")
    @Lob
    private byte[] imagen;

    public Integer getImagenHashCode(){
        return (this.imagen!=null) ? this.imagen.hashCode():null;
    }

}
