package com.bdv.gestiondefirmas.desplieguedecuentas.controllers;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("app")
public class CuentaController {

    @Autowired
    private ICuentaService cuentaService;


    @GetMapping("getCuenta")
    public ResponseEntity<Cuenta>  ver(@RequestParam String idCuenta){
        Optional<Cuenta> o = cuentaService.findById(idCuenta);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

}
