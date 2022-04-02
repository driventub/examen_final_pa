package com.example.uce.exafin.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.uce.exafin.modelo.Vuelo;

public interface IVueloService {
	public Vuelo buscar(Integer id);
	public List<Vuelo> buscarTodos();
	public void actualizar(Vuelo e);
	public void eliminar(Integer id);
	public void insertar(Vuelo e);
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo);
	public Vuelo vueloPorNumero(String vuelo);
}