package com.example.emavias.document;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventario")
public class Inventario {

	public Inventario(@NotNull String ndeserie, String material, int cantidad) {
		super();
		this.ndeserie = ndeserie;
		this.material = material;
		this.cantidad = cantidad;
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
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		Inventario inv = (Inventario) o;
//		return Objects.equals(id, inv.id) && Objects.equals(nombre, inv.nombre);
//	}
//
//	@Override
//	public int hashCode() {
//
//		return Objects.hash(id, nombre);
//	}
//
//	@Override
//	public String toString() {
//		return "Inventario{" + "id='" + id + '\'' + ", name='" + nombre + '\'' + '}';
//	}
}
