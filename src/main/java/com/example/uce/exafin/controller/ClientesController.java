package com.example.uce.exafin.controller;

import java.util.List;

import com.example.uce.exafin.modelo.Vuelo;
import com.example.uce.exafin.service.IVueloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    private IVueloService vueloService;

    @GetMapping("/mostrar")
	public String buscarTodos(Model modelo) {
		List<Vuelo> vuelos = this.vueloService.buscarTodos();
		modelo.addAttribute("vuelos", vuelos);
		return "lista";
	}


    
	@GetMapping("/buscarVuelo")
//	@RequestMapping(path = "/buscar/{idCliente}", method = RequestMethod.GET)
	public String buscarVuelos(Vuelo vuelo) {
		return "buscar_vuelo";
	}

}
