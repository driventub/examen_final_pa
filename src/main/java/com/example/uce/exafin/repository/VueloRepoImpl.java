package com.example.uce.exafin.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.Vuelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class VueloRepoImpl implements IVueloRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(VueloRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Vuelo buscar(Integer id) {
		return this.e.find(Vuelo.class, id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		TypedQuery<Vuelo> myTypedQuery = (TypedQuery<Vuelo>) this.e
				.createQuery("SELECT f FROM Vuelo f    ",Vuelo.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Vuelo e) {
		this.e.merge(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		Vuelo gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Vuelo e) {
		this.e.persist(e);
		
	}

	@Override
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo) {
		TypedQuery<Vuelo> myTypedQuery = (TypedQuery<Vuelo>) this.e
				.createQuery("SELECT f FROM Vuelo f JOIN f.avion d WHERE f.fecha >=:fecha AND WHERE f.estado = 'D'",Vuelo.class);
		myTypedQuery.setParameter("fecha", fechaVuelo);
		
		List<Vuelo> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Vuelo f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
		
	}

	@Override
	public Vuelo vueloPorNumero(String vuelo) {
		TypedQuery<Vuelo> myTypedQuery = (TypedQuery<Vuelo>) this.e
				.createQuery("SELECT f FROM Vuelo f JOIN f.avion d WHERE f.asientos >=:num AND WHERE f.estado = 'D'",Vuelo.class);
		myTypedQuery.setParameter("num", vuelo);
		return myTypedQuery.getSingleResult();
	}

}
