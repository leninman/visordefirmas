package com.bdv.gestiondefirmas.desplieguedecuentas.controllers;


import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.*;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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


    @Autowired
    private ICondicionesService condicionesService;


    @Autowired
    private IFirmanteService firmanteService;

    @Autowired
    private IFirmaService firmaService;


    @Autowired
    private IPersonaService personaService;


    @GetMapping("getCuenta")
    //public ResponseEntity<Cuenta> verCuenta(@RequestParam String idCuenta) {
    public ResponseEntity<Optional<Cuenta>> verCuenta(@RequestParam String idCuenta) {
        Optional<Cuenta> o=cuentaService.findById(idCuenta);
       //Optional<Cuenta> o = cuentaService.findById(idCuenta);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o);
    }

    @GetMapping("getTelefonos")
    public ResponseEntity<?> verTelefonos(@RequestParam String idPersona) {
        List<Telefono> o = telefonoService.findByIdPersona(idPersona);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }

    @GetMapping("getSellos")
    public ResponseEntity<?> verSellos(@RequestParam String idCuenta) {
        List<Sellos> o = sellosService.findByIdCuenta(idCuenta);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }


    @GetMapping("getSello")
    public ResponseEntity<?> verSello(@RequestParam Long idImagen) {
        Sello o = selloService.findByIdImagen(idImagen);
        if (o==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }

    @GetMapping("getCondiciones")
    public ResponseEntity<?> verCondiciones(@RequestParam String idCuenta) {
        List<Optional<Condiciones>> o = condicionesService.findByIdCuenta(idCuenta);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }


    @GetMapping("getFirmantes")
    public ResponseEntity<?> verFirmantes(@RequestParam String idCuenta) {
        List<Optional<Firmante>> o = firmanteService.findByIdCuenta(idCuenta);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }


    @GetMapping("getImagenFirma")
    public ResponseEntity<?> verFirma(@RequestParam Long idImagen) {
        Firma o = firmaService.findByIdImagen(idImagen);
        if (o==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }


    @GetMapping("getPersona")
    public ResponseEntity<?> verPersona(@RequestParam String idPersona) {
        Optional<Persona> o = personaService.findByIdPersona(idPersona);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(o);
    }



}
