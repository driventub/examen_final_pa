package com.example.uce.exafin.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.uce.exafin.modelo.Vuelo;
import com.example.uce.exafin.repository.IVueloRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueloServiceImpl implements IVueloService {
	
	@Autowired
	private IVueloRepo estu;
	
	@Override
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(Vuelo e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(Vuelo e) {
		this.estu.insertar(e);
		
	}

	@Override
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo) {
		return this.estu.buscarVuelosDisponibles(origen, destino, fechaVuelo);
	}

	@Override
	public Vuelo vueloPorNumero(String vuelo) {
		// TODO Auto-generated method stub
		return this.estu.vueloPorNumero(vuelo);
	}

}
