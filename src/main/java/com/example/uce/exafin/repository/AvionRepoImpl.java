package com.example.uce.exafin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.example.uce.exafin.modelo.Avion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class AvionRepoImpl implements IAvionRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(AvionRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Avion buscar(Integer id) {
		return this.e.find(Avion.class, id);
	}

	@Override
	public List<Avion> buscarTodos() {
		TypedQuery<Avion> myTypedQuery = (TypedQuery<Avion>) this.e
				.createQuery("SELECT f FROM Avion f    ",Avion.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Avion e) {
		this.e.merge(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		Avion gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Avion e) {
		this.e.persist(e);
		
	}

}
