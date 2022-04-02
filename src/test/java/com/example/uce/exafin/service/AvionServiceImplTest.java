package com.example.uce.exafin.service;

import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.Avion;

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
public class AvionServiceImplTest {
    
    @Autowired
    private IAvionService avion;

    @Test
    void testAvion(){
        Avion a = new Avion();
        a.setAsientos(33);
        
        this.avion.insertar(a);
        
        Avion a2 = this.avion.buscar(a.getId());
        
        assertThat(0 , not(a2.getAsientos()));
        

    }
}
