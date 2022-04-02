package com.example.uce.exafin.service;

import java.util.List;

import com.example.uce.exafin.modelo.CompraVuelo;
import com.example.uce.exafin.repository.ICompraVueloRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraVueloServiceImpl implements ICompraVueloService {
	
	@Autowired
	private ICompraVueloRepo estu;
	
	@Override
	public CompraVuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<CompraVuelo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(CompraVuelo e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(CompraVuelo e) {
		this.estu.insertar(e);
		
	}

	
	@Override
	public CompraVuelo vueloPorNumero(String vuelo) {
		// TODO Auto-generated method stub
		return this.estu.vueloPorNumero(vuelo);
	}


}
