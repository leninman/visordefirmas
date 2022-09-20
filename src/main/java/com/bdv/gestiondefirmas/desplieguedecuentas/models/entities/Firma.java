package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="FIRMA")
public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name="ID_Firma")
    private Long idFirma;

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
