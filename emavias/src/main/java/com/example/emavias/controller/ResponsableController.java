package com.example.emavias.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emavias.document.Responsable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/responsabledealmacen")
@Api(value = "responsabledealmacen", description = "Operaciones pertenecientes al Responsable del almacen")
public class ResponsableController {
	ConcurrentMap<String, Responsable> responsable = new ConcurrentHashMap<>();

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	@ApiOperation("Gets the product with specific id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Responsable.class) })
	public Responsable getResponsable(@PathVariable(name = "id") String id) {
		return responsable.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Responsable saveRespon(@RequestBody Responsable responToSave) {
		return responsable.put("id", responToSave);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Responsable updateResponsable(@RequestBody Responsable responsableToUpdate,
			@PathVariable(name = "id") String id) {
		return responsable.put("id", responsableToUpdate);
	}

	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void deleteResponsable(@PathVariable(name = "id") String id) {
		responsable.remove(id);
	}
}
