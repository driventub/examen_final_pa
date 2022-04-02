package com.example.uce.exafin.modelo;

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
@Table(name = "avion")
public class Avion {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_avion")
	@SequenceGenerator(name ="seq_avion",sequenceName="seq_avion",allocationSize = 1)
	@Column(name = "avio_id")
	private Integer id;

	@Column(name = "avio_capacidad_asientos")
	private Integer asientos;

	@OneToMany(mappedBy = "avion" ,cascade = CascadeType.ALL )
	private Vuelo vuelo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAsientos() {
		return asientos;
	}

	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	
	
}