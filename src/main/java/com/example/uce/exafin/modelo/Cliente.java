package com.example.uce.exafin.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_cliente")
	@SequenceGenerator(name ="seq_cliente",sequenceName="seq_cliente",allocationSize = 1)
	@Column(name = "clie_id")
	private Integer id;

	@Column(name = "clie_nombre")
	private String nombre;

	@Column(name = "clie_tarjeta")
	private String tarjetaCredito;

	@OneToMany(mappedBy = "cliente" ,cascade = CascadeType.ALL )
	private List<CompraVuelo> compraVuelo;

	

	// Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CompraVuelo> getCompraVuelo() {
		return compraVuelo;
	}

	public void setCompraVuelo(List<CompraVuelo> compraVuelo) {
		this.compraVuelo = compraVuelo;
	}

	

}