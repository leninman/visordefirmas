package com.bdv.gestiondefirmas.desplieguedecuentas.controllers;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sello;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Sellos;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Telefono;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISelloService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ISellosService;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ITelefonoService;
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


    @Autowired
    private ITelefonoService telefonoService;


    @Autowired
    private ISellosService sellosService;

    @Autowired
    private ISelloService selloService;


    @GetMapping("getCuenta")
    public ResponseEntity<Cuenta>  verCuenta(@RequestParam String idCuenta){
        Optional<Cuenta> o = cuentaService.findById(idCuenta);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @GetMapping("getTelefonos")
    public ResponseEntity<Telefono>  verTelefonos(@RequestParam String idPersona){
        Optional<Telefono> o = telefonoService.findByIdPersona(idPersona);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }
    @GetMapping("getSellos")
    public ResponseEntity<?>  verSellos(@RequestParam String idCuenta){
        List<Optional<Sellos>> o = sellosService.findByIdCuenta(idCuenta);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }


    @GetMapping("getSello")
    public ResponseEntity<?>  verSello(@RequestParam Long idImagen){
        Optional<Sello> o = selloService.findByIdImagen(idImagen);
        if(o.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }


}
