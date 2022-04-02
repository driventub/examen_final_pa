package com.example.uce.exafin.repository;

import java.util.List;

import com.example.uce.exafin.modelo.CompraVuelo;

public interface ICompraVueloRepo {
	public CompraVuelo buscar(Integer id);
	public List<CompraVuelo> buscarTodos();
	public void actualizar(CompraVuelo e);
	public void eliminar(Integer id);
	public void insertar(CompraVuelo e);
	public CompraVuelo vueloPorNumero(String vuelo);
}
