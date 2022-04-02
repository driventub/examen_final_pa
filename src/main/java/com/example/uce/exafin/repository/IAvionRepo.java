package com.example.uce.exafin.repository;

import java.util.List;

import com.example.uce.exafin.modelo.Avion;

public interface IAvionRepo {
	public Avion buscar(Integer id);
	public List<Avion> buscarTodos();
	public void actualizar(Avion e);
	public void eliminar(Integer id);
	public void insertar(Avion e);
}