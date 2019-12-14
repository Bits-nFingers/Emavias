package com.example.emavias.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emavias.document.Tecnico;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/tecnico")
@Api(value = "tecnico", description = "Operaciones pertenecientes al Tecnico")
public class TecnicoController {
	ConcurrentMap<String, Tecnico> tec = new ConcurrentHashMap<>();

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	@ApiOperation("Gets the product with specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Tecnico.class) })
	public Tecnico getTecnico(@PathVariable(name = "id") String id) {
		return tec.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Tecnico saveTecnico(@RequestBody Tecnico tecToSave) {
		return tec.put("id", tecToSave);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Tecnico updateTecnico(@RequestBody Tecnico tecnicoToUpdate, @PathVariable(name = "id") String id) {
		return tec.put("id", tecnicoToUpdate);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void deleteTecnico(@PathVariable(name = "id") String id) {
		tec.remove(id);
	}
}
