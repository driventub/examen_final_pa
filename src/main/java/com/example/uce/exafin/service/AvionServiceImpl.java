package com.example.uce.exafin.service;

import java.util.List;

import com.example.uce.exafin.modelo.Avion;
import com.example.uce.exafin.repository.IAvionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvionServiceImpl implements IAvionService {
	
	@Autowired
	private IAvionRepo estu;
	
	@Override
	public Avion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<Avion> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(Avion e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(Avion e) {
		this.estu.insertar(e);
		
	}

}
