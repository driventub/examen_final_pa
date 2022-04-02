package com.example.uce.exafin.service;

import java.util.List;

import com.example.uce.exafin.modelo.CompraVuelo;

// IService


public interface ICompraVueloService {
	public CompraVuelo buscar(Integer id);
	public List<CompraVuelo> buscarTodos();
	public void actualizar(CompraVuelo e);
	public void eliminar(Integer id);
	public void insertar(CompraVuelo e);
	public CompraVuelo vueloPorNumero(String vuelo);

}