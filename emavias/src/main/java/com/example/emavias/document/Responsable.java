package com.example.emavias.document;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "responsabledealmacen")
public class Responsable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Responsable(@NotNull String id, String nombre, String apellido, String contraseña) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contraseña = contraseña;
	}

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @ApiModelProperty(notes = "El id del responsable se guardara por la base de
	// datos")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// @ApiModelProperty(notes = "El nombre se guardara en la base de datos")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// @ApiModelProperty(notes = "El apellido se guardara en la base de datos")
	private String apellido;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

//	@ApiModelProperty(notes = "La contraseña se guardara en la base de datos")
	private String contraseña;

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (o == null || getClass() != o.getClass())
//			return false;
//		Responsable res = (Responsable) o;
//		return Objects.equals(id, res.id) && Objects.equals(nombre, res.nombre);
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
//		return "Responsable{" + "id='" + id + '\'' + ", name='" + nombre + '\'' + '}';
//	}
}