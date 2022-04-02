package com.example.uce.exafin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.CompraVuelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CompraVueloRepoImpl implements ICompraVueloRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(CompraVueloRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public CompraVuelo buscar(Integer id) {
		return this.e.find(CompraVuelo.class, id);
	}

	@Override
	public List<CompraVuelo> buscarTodos() {
		TypedQuery<CompraVuelo> myTypedQuery = (TypedQuery<CompraVuelo>) this.e
				.createQuery("SELECT f FROM CompraVuelo f    ",CompraVuelo.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(CompraVuelo e) {
		this.e.merge(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		CompraVuelo gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(CompraVuelo e) {
		this.e.persist(e);
		
	}

	@Override
	public CompraVuelo vueloPorNumero(String numVuelo) {
		TypedQuery<CompraVuelo> myTypedQuery = (TypedQuery<CompraVuelo>) this.e
				.createQuery("SELECT f FROM CompraVuelo f JOIN f.cliente  d WHERE f.asientos >=:num AND WHERE f.estado = 'D'",CompraVuelo.class);
		myTypedQuery.setParameter("num", numVuelo);
		return myTypedQuery.getSingleResult();
	}

}

