package com.example.emavias.document;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventario")
public class Inventario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Inventario(@NotNull String ndeserie, String material, int cantidad, int fecheUltUso) {
		super();
		this.ndeserie = ndeserie;
		this.material = material;
		this.cantidad = cantidad;
		this.fechaUltUso = fecheUltUso;
	}

	@Id
	@NotNull
	private String ndeserie;

	public String getNdeserie() {
		return ndeserie;
	}

	public void setNdeserie(String ndeserie) {
		this.ndeserie = ndeserie;
	}

	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	private int cantidad;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private int fechaUltUso;

	public int getFechaUltUso() {
		return fechaUltUso;
	}

	public void setFechaUltUso(int fechaUltUso) {
		this.fechaUltUso = fechaUltUso;
	}

}
