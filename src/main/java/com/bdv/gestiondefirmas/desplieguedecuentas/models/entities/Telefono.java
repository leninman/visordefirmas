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
@Table(name="TELEFONOS")
public class Telefono {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="ID_Telefono")
    private Long idTelefono;

    @Column(name="ID_Persona")
    private Long idPersona;

    @Column(name="Numero")
    private String numero;


}
