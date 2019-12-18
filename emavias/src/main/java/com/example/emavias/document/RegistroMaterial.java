package com.example.emavias.document;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registrodematerial")
public class RegistroMaterial implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegistroMaterial(@NotNull String id, int cantidad, String nombProveedor, int ndeserie) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.nombProveedor = nombProveedor;
		this.ndeserie = ndeserie;
	}

	@Id
	@NotNull
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private int cantidad;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	private String nombProveedor;

	public String getNombProveedor() {
		return nombProveedor;
	}

	public void setNombProveedor(String nombProveedor) {
		this.nombProveedor = nombProveedor;
	}

	private int ndeserie;

	public int getNdeserie() {
		return ndeserie;
	}

	public void setNdeserie(int ndeserie) {
		this.ndeserie = ndeserie;
	}
}