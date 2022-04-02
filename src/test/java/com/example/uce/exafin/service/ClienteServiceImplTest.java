package com.example.uce.exafin.service;

import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.Cliente;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(true)
@Transactional
public class ClienteServiceImplTest {
    
    @Autowired
    private IClienteService cliente;

    @Test
    void testCliente(){

        Cliente c = new Cliente();
        c.setNombre("Pepito");

        this.cliente.insertar(c);
        
        Cliente c2 = this.cliente.buscar(c.getId());

        assertThat("Pepito" , equalTo(c2.getNombre()));
    }
    
}
