package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="CUENTAS")
public class Cuenta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CUENTA")
    private Long idCuenta;

    @Column(name="NUMERO_CUENTA")
    private String numeroCuenta;

    //AQUI VA EL RESTO DE LOS ATRIBUTOS

    @Column(name="created_at")
    private LocalDate createdAt;

    @PrePersist
    public void prePersist(){
        this.createdAt= LocalDate.now();
    }

}
