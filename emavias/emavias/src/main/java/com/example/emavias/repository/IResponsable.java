package com.example.emavias.repository;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.emavias.document.Responsable;

@Repository
@CrossOrigin(value = {})
public interface IResponsable extends MongoRepository<Responsable, Serializable> {
	@RestResource(path = "apellido", rel = "apellido")
	public List<Responsable> findByApellidoOrderByNombre(@Param("apellido") String apellido, Pageable p);
}
