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
public class Condiciones implements Serializable {

    @Id
    @Column(name="ID_Tipo1")
    private Integer idTipo1;

    @Column(name="Tipo1")
    private String Tipo1;

    @Column(name="ID_Tipo2")
    private Integer idTipo2;

    @Column(name="Tipo2")
    private String Tipo2;

    @Column(name="Monto")
    private Double monto;








}
