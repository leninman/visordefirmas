package com.bdv.gestiondefirmas.desplieguedecuentas.controllers;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CuentaController {

    @Autowired
    private ICuentaService cuentaService;

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(cuentaService.findAll());
    }

    @GetMapping("vercuenta")
    public ResponseEntity<?>  ver(@RequestParam Long id){
        Optional<Cuenta> o = cuentaService.findById(id);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Cuenta cuenta){
        Cuenta alumnoDb=cuentaService.save(cuenta);
        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);
    }


    @PutMapping
    public ResponseEntity<?> editar(@RequestBody Cuenta alumno,@RequestParam Long id){
        Optional<Cuenta> o =cuentaService.findById(id);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        Cuenta cuentaDb=o.get();
        cuentaDb.setNumeroCuenta(cuentaDb.getNumeroCuenta());
        return ResponseEntity.status(HttpStatus.CREATED).body(cuentaService.save(cuentaDb));
    }

    @DeleteMapping
    public ResponseEntity<?> eliminar(@RequestParam Long id){
        cuentaService.deleteById(id);
        return ResponseEntity.noContent().build();

    }

}
