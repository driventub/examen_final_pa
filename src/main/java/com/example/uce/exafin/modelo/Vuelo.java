package com.example.uce.exafin.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "vuelo")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_vuelo")
	@SequenceGenerator(name ="seq_vuelo",sequenceName="seq_vuelo",allocationSize = 1)
	@Column(name = "vuel_id")
	private Integer id;

	@Column(name = "vuel_numero")
	private String numero;

	@Column(name = "vuel_fecha_vuelo" , columnDefinition = "TIMESTAMP")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime fechaVuelo;

	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosDisponibles;

	@Column(name = "vuel_valor_asiento")
	private BigDecimal valorAsiento;

	@Column(name = "vuel_estado")
	private String estado;

	@Column(name = "vuel_origen")
	private String origen;

	@Column(name = "vuel_destino")
	private String destino;

	@OneToMany(mappedBy = "vuelo" ,cascade = CascadeType.ALL )
	private List<CompraVuelo> compraVuelo;

	@ManyToOne
	@JoinColumn(name = "avion_id")
	private Avion avion;

	// Set y Get

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

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<CompraVuelo> getCompraVuelo() {
		return compraVuelo;
	}

	public void setCompraVuelo(List<CompraVuelo> compraVuelo) {
		this.compraVuelo = compraVuelo;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
	

	
	
}