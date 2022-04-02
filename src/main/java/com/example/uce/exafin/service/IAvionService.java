package com.example.uce.exafin.service;

import java.util.List;

import com.example.uce.exafin.modelo.Avion;

public interface IAvionService {
	public Avion buscar(Integer id);
	public List<Avion> buscarTodos();
	public void actualizar(Avion e);
	public void eliminar(Integer id);
	public void insertar(Avion e);
}
