package com.example.uce.exafin.service;

import java.util.List;

import com.example.uce.exafin.modelo.Cliente;
import com.example.uce.exafin.repository.IClienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepo estu;
	
	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estu.buscar(id);
	}

	@Override
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return this.estu.buscarTodos();
	}

	@Override
	public void actualizar(Cliente e) {
		this.estu.actualizar(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.estu.eliminar(id);
		
	}

	@Override
	public void insertar(Cliente e) {
		this.estu.insertar(e);
		
	}

}
