package com.bdv.gestiondefirmas.desplieguedecuentas.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="PERSONAS")
public class Persona {
    @Id
    @Column(name="ID_Persona")
    private String idPersona;

    @Column(name="Nombre")
    private String nombre;

    @Column(name="Direccion")
    private String direccion;

}
