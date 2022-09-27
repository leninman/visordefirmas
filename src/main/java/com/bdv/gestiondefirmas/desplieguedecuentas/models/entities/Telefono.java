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
public class Telefono {


   @Id
    @Column(name="Telefono")
    private String telefono;


}
