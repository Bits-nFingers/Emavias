package com.example.emavias.repository;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.emavias.document.Personal;

@Repository
@CrossOrigin(value = {})
public interface IPersonal extends MongoRepository<Personal, Serializable> {
	@RestResource(path = "nombre", rel = "nombre")
	public List<Personal> findByApellidoOrderByNombre(@Param("nombre") String apellido, Pageable p);
}
