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
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
 //   @Column(name = "id", nullable = false)
 //   private Long id;

    @Id
    //@Column(name="ID_Tipo1")
    private Integer id_tipo1;

   // @Column(name="Tipo1")
    private String tipo;

   // @Column(name="ID_Tipo2")
    private Integer id_tipo2;

  //  @Column(name="Tipo2")
   // private String tipo2;

   // @Column(name="Monto")
    private Double monto;








}
