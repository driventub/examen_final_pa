package com.example.uce.exafin.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "compra_vuelo")
public class CompraVuelo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_copa")
	@SequenceGenerator(name ="seq_copa",sequenceName="seq_copa",allocationSize = 1)
	@Column(name = "copa_id")
	private Integer id;

	@Column(name = "copa_numero")
	private String numero;

	@Column(name = "copa_fecha_compra")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime fechaCompra;

	@Column(name = "copa_numero_tarjeta")
	private String numTarjeta;
	
	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer asientosComprados;

	@Column(name = "copa_estado")
	private String estado;

	@Column(name = "copa_categoria")
	private String categoria;
	
	@ManyToOne
	@JoinColumn(name = "vuelo_id")
	private Vuelo vuelo;

	@ManyToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public Integer getAsientosComprados() {
		return asientosComprados;
	}

	public void setAsientosComprados(Integer asientosComprados) {
		this.asientosComprados = asientosComprados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// Set y Get
	

}