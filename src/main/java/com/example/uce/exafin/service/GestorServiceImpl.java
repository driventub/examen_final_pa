package com.example.uce.exafin.service;

import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.CompraVuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GestorServiceImpl implements IGestorService{

    @Autowired
    private ICompraVueloService comprar;

    @Autowired
    private IClienteService clie; 

    @Override
    @Transactional
    public void reservarPasaje(String num) {
        
        CompraVuelo c = this.comprar.vueloPorNumero(num);
        
        



        
    }

    @Override
    public void checkIn(String numPasaje) {
        // TODO Auto-generated method stub
        
    }
    
}
