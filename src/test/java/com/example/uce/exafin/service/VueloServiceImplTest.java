package com.example.uce.exafin.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.Vuelo;

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
public class VueloServiceImplTest {
    
    @Autowired
    private IVueloService vuelo;

    @Test
    void testVuelo(){
        Vuelo v = new Vuelo();
        
        v.setAsientosDisponibles(33);
        v.setFechaVuelo(LocalDateTime.of(2022,Month.AUGUST,8,12,45));
        v.setNumero("CAA-333");
        v.setValorAsiento(new BigDecimal("2222.22"));
        v.setEstado("D");
        v.setOrigen("Marruecos");
        v.setDestino("Pensilvania");

        this.vuelo.insertar(v);

        Vuelo v2 = this.vuelo.buscar(v.getId());
        assertThat(v2.getAsientosDisponibles() , equalTo(v.getAsientosDisponibles()));
    }
}
