package com.bdv.gestiondefirmas.desplieguedecuentas.services.implementaciones;

import com.bdv.gestiondefirmas.desplieguedecuentas.models.entities.Cuenta;
import com.bdv.gestiondefirmas.desplieguedecuentas.models.repositories.CuentaRepository;
import com.bdv.gestiondefirmas.desplieguedecuentas.services.ICuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ICuentaServiceImpl implements ICuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    private final static String ACCION_SELECT_PRODUCTO="SELECT_PRODUCTO";

    public ICuentaServiceImpl(CuentaRepository cuentaRepository) {
    }


    @Override
    @Transactional(readOnly=true)
    public Optional<Cuenta> findById(String idCuenta) {
    //public Optional<Map<String,Object>> findById(String idCuenta) {

       // String sProducto=idCuenta;

       //  Optional<Map<String,Object>> mapa=cuentaRepository.sp_VISOR("SELECT_PRODUCTO",sProducto,"");
       return cuentaRepository.findCuenta(idCuenta);
     //   return mapa;
    }




}
