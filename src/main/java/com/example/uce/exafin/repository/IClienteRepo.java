package com.example.uce.exafin.repository;

import java.util.List;

import com.example.uce.exafin.modelo.Cliente;

public interface IClienteRepo {
	public Cliente buscar(Integer id);
	public List<Cliente> buscarTodos();
	public void actualizar(Cliente e);
	public void eliminar(Integer id);
	public void insertar(Cliente e);
}
